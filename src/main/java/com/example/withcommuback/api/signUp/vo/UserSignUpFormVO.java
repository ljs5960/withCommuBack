package com.example.withcommuback.api.signUp.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserSignUpFormVO {

    @NotNull
    @Email
    private String userEmail;

    @NotNull
    private String userPwd;

    @NotNull
    private String userPwdCheck;

    @NotNull
    private String userName;

    @NotNull
    private String userPhone;

    @NotNull
    private String userNick;
}
