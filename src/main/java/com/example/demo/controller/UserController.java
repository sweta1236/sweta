package com.example.demo.controller;
//
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addBalance/{userId}")
    public void addBalance(@PathParam("userId") Long userId, String amount){
        boolean response = userService.addBalance(userId,amount);
    }

    @GetMapping("/getBalance/{userId}")
    public UserEntity getBalance(@PathParam("userId")Long userId){
        UserEntity user = userService.getBalance(userId);
        return user;
    }
}
