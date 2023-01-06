package com.example.withcommuback.api.signUp.biz;

import com.example.withcommuback.api.signUp.vo.UserVO;
import com.example.withcommuback.rep.user.UserRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class SignUpService {

    private final UserRepository userRepository;

    @Transactional
    public UserVO create(UserVO userVO) {
        return userRepository.save(userVO);
    }
}
