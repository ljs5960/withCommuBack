package com.example.withcommuback.api.signUp.biz;

import com.example.withcommuback.api.signUp.vo.UserVO;
import com.example.withcommuback.rep.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class SignUpService {

    private final UserRepository userRepository;
    public UserVO create(UserVO userVO) {
        //서비스단에서 다 처리함
        return userRepository.save(userVO);
    }
}
