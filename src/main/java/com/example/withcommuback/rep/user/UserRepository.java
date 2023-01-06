package com.example.withcommuback.rep.user;

import com.example.withcommuback.api.signUp.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserVO, Long> {
}
