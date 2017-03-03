package com.javaWebExam.controllers;

import com.javaWebExam.entities.User;
import com.javaWebExam.models.bindingModels.RegisterModel;
import com.mvcFramework.annotations.controller.Controller;
import com.mvcFramework.annotations.parameters.ModelAttribute;
import com.mvcFramework.annotations.request.GetMapping;
import com.mvcFramework.annotations.request.PostMapping;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

@Stateless
@Controller
public class UserController {

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
    }
}
