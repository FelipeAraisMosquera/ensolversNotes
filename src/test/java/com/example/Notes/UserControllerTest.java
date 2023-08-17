package com.example.Notes;

import com.example.Notes.controllers.UserController;
import com.example.Notes.dtos.LoginBody;
import com.example.Notes.dtos.UserDto;
import com.example.Notes.responses.LoginResponse;
import com.example.Notes.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCreateUser() {

        UserDto inputUser = new UserDto();
        UserDto createdUser = new UserDto();
        when(userService.createUser(inputUser)).thenReturn(createdUser);


        ResponseEntity<UserDto> response = userController.createUser(inputUser);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(createdUser, response.getBody());
    }

    @Test
    void testUpdateUser() {
        UserDto inputUser = new UserDto();
        int userId = 456;
        UserDto updatedUser = new UserDto();
        when(userService.updateUser(inputUser, userId)).thenReturn(updatedUser);

        ResponseEntity<UserDto> response = userController.updateUser(inputUser, userId);

        // Verificar resultados
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(updatedUser, response.getBody());
    }

    @Test
    void testDeleteUser() {
        int userId = 789;

        ResponseEntity<String> response = userController.deleteUser(userId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        verify(userService, times(1)).deleteUser(userId);
    }

    @Test
    void testGetUser() {
        int userId = 123;
        UserDto userDto = new UserDto();
        when(userService.getUser(userId)).thenReturn(userDto);

        ResponseEntity<UserDto> response = userController.getUser(userId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(userDto, response.getBody());
    }

    @Test
    void testGetAllUsers() {
        List<UserDto> userDtos = new ArrayList<>();
        when(userService.getAllUser()).thenReturn(userDtos);

        // Ejecutar la acción del controlador
        ResponseEntity<List<UserDto>> response = userController.getAllUsers();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(userDtos, response.getBody());
    }

    @Test
    void testUserLogin_Success() {
        LoginBody loginBody = new LoginBody();
        UserDto loggedInUser = new UserDto();
        when(userService.userLogin(loginBody.getEmail(), loginBody.getPassword())).thenReturn(loggedInUser);

        ResponseEntity<LoginResponse> response = userController.userLogin(loginBody);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(loggedInUser, response.getBody());
    }


}