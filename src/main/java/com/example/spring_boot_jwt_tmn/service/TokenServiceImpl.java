package com.example.spring_boot_jwt_tmn.service;


import com.example.spring_boot_jwt_tmn.entity.Token;
import com.example.spring_boot_jwt_tmn.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements com.example.spring_boot_jwt_tmn.service.TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

