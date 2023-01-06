package com.example.withcommuback.api.signUp.biz;

import com.example.withcommuback.api.signUp.vo.UserVO;
import com.example.withcommuback.rep.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    private final UserRepository userRepository;

    public SignUpService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(UserVO userVO) {
        userRepository.save(userVO);
    }
}
