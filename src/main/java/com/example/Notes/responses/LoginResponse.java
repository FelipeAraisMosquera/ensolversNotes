package com.example.Notes.responses;

import com.example.Notes.dtos.UserDto;

public class LoginResponse {
    private UserDto user;
    private String token;

    public LoginResponse(UserDto user, String token) {
        this.user = user;
        this.token = token;
    }

    public UserDto getUser() {
        return this.user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
