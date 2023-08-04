package com.example.UserLoginSystem.service;

import com.example.UserLoginSystem.entity.User;

public interface UserService {
    User findByUsername(String username);
}
