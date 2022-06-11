package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @Operation(summary = "add User Balance")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully added balance",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Boolean.class))}),
            @ApiResponse(responseCode = "404", description = "Unable to find the user",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = @Content)})
    @PostMapping("/addBalance/{userId}")
    public boolean addBalance(@PathParam("userId") Long userId, String amount) {
        boolean response = userService.addBalance(userId, amount);
        return response;
    }

    @Operation(summary = "get User Balance")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully in fetching the user balance",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Boolean.class))}),
            @ApiResponse(responseCode = "404", description = "Unable to find the user",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = @Content)})
    @GetMapping("/getBalance/{userId}")
    public UserEntity getBalance(@PathParam("userId") Long userId) {
        UserEntity user = userService.getBalance(userId);
        return user;
    }
}
