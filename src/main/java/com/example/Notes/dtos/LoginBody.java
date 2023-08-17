package com.example.Notes.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginBody {
    private String email;
    private String password;
}
