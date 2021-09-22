package com.example.spring_boot_jwt_tmn.service;


import com.example.spring_boot_jwt_tmn.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
