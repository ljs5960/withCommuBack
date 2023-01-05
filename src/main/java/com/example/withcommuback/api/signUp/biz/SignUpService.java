package com.example.withcommuback.api.signUp.biz;

import com.example.withcommuback.rep.user.SignUpRepository;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    private final SignUpRepository signUpRepository;

    public SignUpService(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

//    public UserVO signUp(UserVO inputUserVO) {
//        UserVO dbUserVO = UserVO.builder()
//            .inputUserVO.getEmail()
//
//            .build();
//    }
}
