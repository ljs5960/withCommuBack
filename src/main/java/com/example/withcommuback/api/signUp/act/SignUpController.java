package com.example.withcommuback.api.signUp.act;

import com.example.withcommuback.api.signUp.biz.SignUpService;
import com.example.withcommuback.api.signUp.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/signUp")
public class SignUpController {

    private final SignUpService signUpService;

    @PostMapping("/ins")
    //리턴은 map or list or vo
    public UserVO signUp(@ModelAttribute UserVO userVO){
        //컨트롤러단은 매핑만
        return signUpService.create(userVO);
    }
}
