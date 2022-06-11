package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserControllerTest {

    @MockBean
    UserService userService;

    @Autowired
    UserController userController;

    @Test
    public void testaddBalanceApi() {
        UserEntity user = new UserEntity();
        user.setUserId(123L);
        user.setCurrencyBalance("1000");
        user.setPassword("");
        when(userService.getBalance(123L)).thenReturn(user);
        boolean status = userController.addBalance(123L, "1000");
        assertTrue(status);

    }

    @Test
    public void testgetBalanceApi() {
        UserEntity user = new UserEntity();
        user.setUserId(123L);
        user.setCurrencyBalance("1000");
        user.setPassword("");
        when(userService.getBalance(123L)).thenReturn(user);
        UserEntity userEntity = userController.getBalance(123L);
        assertEquals(userEntity.getCurrencyBalance(),"1000");
    }
}
