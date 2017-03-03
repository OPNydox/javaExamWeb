package com.javaWebExam.services;


import com.javaWebExam.entities.User;
import com.javaWebExam.models.bindingModels.LoginModel;
import com.javaWebExam.models.bindingModels.RegisterModel;

public interface UserService {

    User registerUser(RegisterModel registerModel);

    User findLoggedInUser(LoginModel loginModel);
}
