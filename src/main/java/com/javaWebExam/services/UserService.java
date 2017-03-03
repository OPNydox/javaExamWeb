package com.javaWebExam.services;


import com.javaWebExam.entities.User;
import com.javaWebExam.models.bindingModels.LoginModel;

public interface UserService {

    void registerUser(User user);

    User findLoggedInUser(LoginModel loginModel);
}
