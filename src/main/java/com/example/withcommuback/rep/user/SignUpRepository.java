package com.example.withcommuback.rep.user;

import com.example.withcommuback.api.signUp.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<UserVO, Long> {

}
