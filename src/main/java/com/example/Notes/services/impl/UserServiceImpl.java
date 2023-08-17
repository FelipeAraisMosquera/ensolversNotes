package com.example.Notes.services.impl;

import com.example.Notes.dtos.UserDto;
import com.example.Notes.models.entitys.User;
import com.example.Notes.repositories.UserRepository;
import com.example.Notes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user=this.userRepository.save(this.DtoToUser(userDto));
        return this.UserToDto(user);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
        User user = this.userRepository.findById(userId).orElseThrow();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        User updatedUser = this.userRepository.save(user);
        return this.UserToDto(updatedUser);
    }


    @Override
    public void deleteUser(Integer userId) {
        User user= this.userRepository.findById(userId).orElseThrow();
        this.userRepository.delete(user);
    }

    @Override
    public UserDto getUser(Integer userId) {
        User user= this.userRepository.findById(userId).orElseThrow();
        return this.UserToDto(user);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users=this.userRepository.findAll();
        List<UserDto> allNotes= users.stream().map((user)->this.UserToDto(user)).collect(Collectors.toList());
        return allNotes;
    }

    @Override
    public UserDto userLogin(String email, String password) {
        User user= this.userRepository.findByEmailAndPassword(email,password);
        return this.UserToDto(user);
    }
    //%%%%%%%%%%%%%%%%%%%%%%%

    public UserDto UserToDto(User user ) {
        UserDto userDto= new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        return userDto;
    }

    public User DtoToUser(UserDto userDto ) {
        User user= new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return user;
    }

}
