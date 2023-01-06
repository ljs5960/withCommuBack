package com.example.withcommuback.api.signUp.biz;

import com.example.withcommuback.api.signUp.vo.UserSignUpFormVO;
import com.example.withcommuback.api.signUp.vo.UserVO;
import com.example.withcommuback.rep.user.UserRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Slf4j
@RequiredArgsConstructor
@Service
public class SignUpService {

    private final UserRepository userRepository;

    @Transactional
    public UserVO create(UserSignUpFormVO userSignUpFormVO) {
        UserVO userVO = null;
        try {
            userVO = UserVO.builder()
                    .email(userSignUpFormVO.getUserEmail())
                    .password(userSignUpFormVO.getUserPwd())
                    .name(userSignUpFormVO.getUserName())
                    .phone(userSignUpFormVO.getUserPhone())
                    .nickName(userSignUpFormVO.getUserNick())
                    .ipAddress(Inet4Address.getLocalHost().getHostAddress())
                    .isBlocked("N")
                    .build();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return userRepository.save(userVO);
    }
}
