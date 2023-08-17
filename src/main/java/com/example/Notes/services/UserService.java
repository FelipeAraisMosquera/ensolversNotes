package com.example.Notes.services;

import com.example.Notes.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto, Integer userId);

    void deleteUser(Integer userId);

    UserDto getUser(Integer userId);

    List<UserDto> getAllUser();

    UserDto userLogin(String email, String password);


}
