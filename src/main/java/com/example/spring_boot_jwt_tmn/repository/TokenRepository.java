package com.example.spring_boot_jwt_tmn.repository;

import com.example.spring_boot_jwt_tmn.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}