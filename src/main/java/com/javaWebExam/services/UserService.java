package com.javaWebExam.services;


import com.javaWebExam.entities.User;

public interface UserService {

    void registerUser(User user);

    User getUserByName(String username);
}
