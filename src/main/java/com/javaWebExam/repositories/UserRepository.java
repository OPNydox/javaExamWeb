package com.javaWebExam.repositories;


import com.javaWebExam.entities.User;

public interface UserRepository {
    User getUserByName(String username);

    void registerUser(User userToRegister);
}
