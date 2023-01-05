package com.example.withcommuback.api.signUp.act;

import com.example.withcommuback.api.signUp.UserSignUpForm;
import com.example.withcommuback.api.signUp.biz.SignUpService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignUpController {

    private final SignUpService signUpService;

    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    /*
    TODO: 회원가입 폼 return 완성하기
     */
    @GetMapping
    public void signUp(UserSignUpForm userSignUpForm) {
    }

    /*
    TODO: 회원가입 제출 완료짓기
     */
    @PostMapping
    public void signUp(@Valid UserSignUpForm userSignUpForm, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "redirect:/signup";
//        }
//
//        if (userSignUpForm.getUserPwd1().equals(userSignUpForm.getUserPwd2())) {
//            return "redirect:/signup";
//        }

//        signUpService.create(userSignUpForm);
    }

}
