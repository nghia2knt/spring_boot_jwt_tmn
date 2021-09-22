package com.example.spring_boot_jwt_tmn.service;


import com.example.spring_boot_jwt_tmn.authen.UserPrincipal;
import com.example.spring_boot_jwt_tmn.entity.User;

public interface UserService {
    User createUser(User user);

}
