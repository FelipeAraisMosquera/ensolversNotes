package com.example.Notes.controllers;

import com.example.Notes.dtos.DtoProcessingException;
import com.example.Notes.dtos.LoginBody;
import com.example.Notes.dtos.UserDto;
import com.example.Notes.responses.LoginResponse;
import com.example.Notes.services.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        UserDto userDto =  this.userService.createUser(user);
        return ResponseEntity.ok(userDto);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto user,@PathVariable Integer userId){
        UserDto userDto =  this.userService.updateUser(user, userId);
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer userId){
        this.userService.deleteUser(userId);
        return ResponseEntity.ok("User deleted successfully");
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable Integer userId){
        UserDto userDto =  this.userService.getUser(userId);
        return ResponseEntity.ok(userDto);
    }

    @GetMapping()
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> userDtos =  this.userService.getAllUser();
        return ResponseEntity.ok(userDtos);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> userLogin(@RequestBody LoginBody loginBody){
        UserDto apiRes = new UserDto();
        try {
            apiRes = this.userService.userLogin(loginBody.getEmail(), loginBody.getPassword());
            System.out.println(apiRes.getEmail()+ "--" +apiRes.getPassword());

            if (apiRes != null) {
                String token = generateToken(apiRes.getId());
                System.out.println(token);
                return ResponseEntity.ok(new LoginResponse(apiRes, token));
            } else {
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private String generateToken(Integer userId) {
        try {
            return Jwts.builder()
                .setSubject(String.valueOf(userId))
                .signWith(SignatureAlgorithm.HS256, "1ae9ee9c0d3b03eb78336dd85e1b8235561b87168813cdfd2c0e22864c041936ea7921e0930d6226ac66c37fedad24d664ecbef70790640d752f9f111033dbff95540416bbae3b8a1ad9820a9e815120")
                    .compact();

            } catch (Exception e) {
                throw new DtoProcessingException("Error generando el token: " + e.getMessage());
            }
    }

}
