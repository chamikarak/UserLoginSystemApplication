package com.example.UserLoginSystem.service;

import com.example.UserLoginSystem.entity.UserLoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginDetailsRepository extends JpaRepository<UserLoginDetails, Long> {
    // Add custom methods if needed
}
