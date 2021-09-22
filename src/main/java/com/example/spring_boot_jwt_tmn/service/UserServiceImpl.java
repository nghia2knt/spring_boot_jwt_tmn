package com.example.spring_boot_jwt_tmn.service;


import com.example.spring_boot_jwt_tmn.authen.UserPrincipal;
import com.example.spring_boot_jwt_tmn.entity.User;
import com.example.spring_boot_jwt_tmn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements com.example.spring_boot_jwt_tmn.service.UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }


}