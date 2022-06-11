package com.example.demo.service;


import com.example.demo.entity.UserEntity;

public interface UserService {
    boolean addBalance(Long userId, String amount);

    UserEntity getBalance(Long userId);
}
