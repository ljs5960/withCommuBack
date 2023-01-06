package com.example.withcommuback.api.signUp.act;

import com.example.withcommuback.api.signUp.biz.SignUpService;
import com.example.withcommuback.api.signUp.biz.UserSignUpForm;
import com.example.withcommuback.api.signUp.vo.UserVO;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signUp")
public class SignUpController {

    private final SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @GetMapping
    public void signUp(UserSignUpForm userSignUpForm) {
    }

    @PostMapping("/ins")
    public UserVO signUp(@Valid UserSignUpForm userSignUpForm, BindingResult bindingResult,
        HttpServletResponse response) throws IOException {

        if ((bindingResult.hasErrors()) || (userSignUpForm.getPassword1()
            .equals(userSignUpForm.getPassword2()))) {
            response.sendRedirect("/api/signup");

            return null;
        }

        return UserVO.builder()
            .name(userSignUpForm.getName())
            .email(userSignUpForm.getEmail())
            .password(userSignUpForm.getPassword1())
            .phoneNumber(userSignUpForm.getPhoneNumber())
            .build();
    }
}
