package com.javaWebExam.servicesImpl;

import com.javaWebExam.entities.User;
import com.javaWebExam.models.bindingModels.LoginModel;
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
    public void registerUser(User user) {
        userRepository.registerUser(user);
    }

    @Override
    public User findLoggedInUser(LoginModel loginModel) {
        return userRepository.getLoggedUser(loginModel.getUsername(), loginModel.getPassword());
    }
}
