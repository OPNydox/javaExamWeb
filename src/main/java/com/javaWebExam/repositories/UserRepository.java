package com.javaWebExam.repositories;


import com.javaWebExam.entities.User;

public interface UserRepository {
    User getLoggedUser(String username, String password);

    void registerUser(User userToRegister);
}
