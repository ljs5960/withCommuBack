package com.example.withcommuback.api.signUp.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_email", nullable = false, length = 45, unique = true)
    private String email;

    @Column(name = "user_pwd", nullable = false, length = 45)
    private String password;

    @Column(name = "user_name", nullable = false, length = 45)
    private String name;

    @Column(name = "user_phone", nullable = false, length = 45)
    private String phone;

    @Column(name = "user_nickname", nullable = false, length = 45)
    private String nickName;

    @Column(name = "user_ip", nullable = false, length = 45)
    private String ipAddress;

    @ColumnDefault("N")
    @Column(name = "user_block", nullable = false, length = 1)
    private String isBlocked;
}
