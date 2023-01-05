package com.example.withcommuback.api.signUp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class UserSignUpForm {

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String userPwd1;

    @NotNull
    private String userPwd2;

    @NotNull
    private String phone;

    @NotNull
    private String ip;

    @NotNull
    private String isBlocked;
}
