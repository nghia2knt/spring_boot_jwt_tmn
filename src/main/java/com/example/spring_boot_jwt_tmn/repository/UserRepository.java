package com.example.spring_boot_jwt_tmn.repository;

import com.example.spring_boot_jwt_tmn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
