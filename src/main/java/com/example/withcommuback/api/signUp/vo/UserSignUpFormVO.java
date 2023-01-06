package com.example.withcommuback.api.signUp.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserSignUpFormVO {

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String password1;

    @NotNull
    private String password2;

    @NotNull
    private String phoneNumber;
}
