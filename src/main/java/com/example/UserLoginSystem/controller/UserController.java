package com.example.UserLoginSystem.controller;

import com.example.UserLoginSystem.entity.User;
import com.example.UserLoginSystem.service.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Implementing logic to create a new user
        userRepository.save(user);
        return ResponseEntity.ok("User created successfully.");
    }


}

