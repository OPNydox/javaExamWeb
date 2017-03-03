package com.javaWebExam.controllers;

import com.javaWebExam.entities.User;
import com.javaWebExam.models.bindingModels.LoginModel;
import com.javaWebExam.models.bindingModels.RegisterModel;
import com.javaWebExam.services.UserService;
import com.mvcFramework.annotations.controller.Controller;
import com.mvcFramework.annotations.parameters.ModelAttribute;
import com.mvcFramework.annotations.request.GetMapping;
import com.mvcFramework.annotations.request.PostMapping;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Stateless
@Controller
public class UserController {

    @Inject
    private UserService userService;

    @GetMapping("/register")
    public String getRegister(HttpSession session){
        if (session.getAttribute("logged_user") == null){
            return "templates/register";
        }

        return "redirect:/";
    }

    @PostMapping("/register")
    public String postRegister(@ModelAttribute RegisterModel registerModel, HttpSession session){
        User user = new User();

        user.setUsername(registerModel.getUsername());
        user.setPassword(registerModel.getPassword());

        userService.registerUser(user);

        session.setAttribute("logged_user", user);

        return "redirect:/";
    }

    @GetMapping("/login")
    public String getLogin(HttpSession session){
        if(session.getAttribute("logged_user") == null){
            return "templates/login";
        }
        return "redirect:/";
    }

    @GetMapping("/login")
    public String postLogin(@ModelAttribute LoginModel loginModel, HttpSession session){
        User user = userService.findLoggedInUser(loginModel);

        if (user == null){
            return "redirect:/login";
        }

        session.setAttribute("logged_user", user);

        return "redirect:/";
    }
}









