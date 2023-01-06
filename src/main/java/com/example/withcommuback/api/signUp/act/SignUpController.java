package com.example.withcommuback.api.signUp.act;

import com.example.withcommuback.api.signUp.biz.SignUpService;
import com.example.withcommuback.api.signUp.vo.UserSignUpFormVO;
import com.example.withcommuback.api.signUp.vo.UserVO;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.example.withcommuback.utils.RequestUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/signUp")
public class SignUpController {

    private final SignUpService signUpService;

    @PostMapping("/ins")
    public UserVO signUp(@Valid @RequestBody UserSignUpFormVO userSignUpFormVO,
        BindingResult bindingResult) {

        /*
        TODO 반환값 설정하기
         */
        if (bindingResult.hasErrors()) {
            return null;
        }
        /*
        비밀번호 일치 여부
        TODO 반환값 설정하기
        */
        if (!userSignUpFormVO.getUserPwd().equals(userSignUpFormVO.getUserPwdCheck())) {
            return null;
        }

        return signUpService.create(userSignUpFormVO);
    }
}
