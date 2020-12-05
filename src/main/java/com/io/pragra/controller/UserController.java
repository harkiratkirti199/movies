package com.io.pragra.controller;

import com.io.pragra.domain.User;
import com.io.pragra.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }

}
