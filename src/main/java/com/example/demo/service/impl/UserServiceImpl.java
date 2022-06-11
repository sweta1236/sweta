package com.example.demo.service.impl;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import lombok.Lombok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean addBalance(Long userId, String amount) {
        boolean status = false;
        try {
            UserEntity user = userRepository.getById(userId);
            user.setCurrencyBalance(amount);
            UserEntity updatedUser = userRepository.save(user);
            status = true;
        }
        catch (Exception e ){
            status = false;
        }
        return status;
    }

    @Override
    public UserEntity getBalance(Long userId) {
        UserEntity user = userRepository.getById(userId);
        return user;
    }
}
