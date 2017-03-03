package com.javaWebExam.servicesImpl;

import com.javaWebExam.entities.User;
import com.javaWebExam.entities.UserRole;
import com.javaWebExam.models.bindingModels.LoginModel;
import com.javaWebExam.models.bindingModels.RegisterModel;
import com.javaWebExam.repositories.UserRepository;
import com.javaWebExam.services.UserService;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@Local(UserService.class)
public class UserServiceImpl implements UserService{

    @Inject
    private UserRepository userRepository;

    @Override
    public User registerUser(RegisterModel registerModel)
    {
        User newUser = new User();
        newUser.setUsername(registerModel.getUsername());
        newUser.setPassword(registerModel.getPassword());
        newUser.setFullName(registerModel.getFullName());
        newUser.setRole(UserRole.USER);
        userRepository.registerUser(newUser);

        return newUser;
    }

    @Override
    public User findLoggedInUser(LoginModel loginModel) {
        return userRepository.getLoggedUser(loginModel.getUsername(), loginModel.getPassword());
    }
}
