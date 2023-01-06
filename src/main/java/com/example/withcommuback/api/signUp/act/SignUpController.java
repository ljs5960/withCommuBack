package com.example.withcommuback.api.signUp.act;

import com.example.withcommuback.api.signUp.biz.SignUpService;
import com.example.withcommuback.api.signUp.biz.UserSignUpForm;
import com.example.withcommuback.api.signUp.vo.UserVO;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/signUp")
public class SignUpController {

    private final SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }



    @PostMapping("/ins")
    public UserVO signUp(){
        return UserVO.builder()
            .name("123")
            .email("123")
            .password("123")
            .phoneNumber("123")
            .build();
    }
}
