package com.example.withcommuback.api.signUp.act;

import com.example.withcommuback.api.signUp.biz.SignUpService;
import com.example.withcommuback.api.signUp.vo.UserSignUpFormVO;
import com.example.withcommuback.api.signUp.vo.UserVO;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
        if (userSignUpFormVO.getUserPwd().equals(userSignUpFormVO.getUserPwdCheck())) {
            return null;
        }

        UserVO userVO = UserVO.builder()
            .email(userSignUpFormVO.getUserEmail())
            .password(userSignUpFormVO.getUserPwd())
            .name(userSignUpFormVO.getUserName())
            .phone(userSignUpFormVO.getUserPhone())
            .nickName(userSignUpFormVO.getUserNick())
            .build();

        log.info("info: {}", userVO.getEmail());

        return signUpService.create(userVO);
    }
}
