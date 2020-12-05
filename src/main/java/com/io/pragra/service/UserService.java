package com.io.pragra.service;

import com.io.pragra.domain.User;
import com.io.pragra.repo.UserRepo;

public class UserService {

    private UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public User createUser(User user){
        return repo.save(user);
    }
}
