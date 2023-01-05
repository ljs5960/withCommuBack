package com.example.withcommuback.rep.user;

import com.example.withcommuback.api.login.vo.LoginVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<LoginVO, Long> {
}
