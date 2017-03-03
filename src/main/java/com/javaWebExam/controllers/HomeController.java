package com.javaWebExam.controllers;

import com.mvcFramework.annotations.controller.Controller;
import com.mvcFramework.annotations.request.GetMapping;
import com.mvcFramework.models.Model;

import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

@Stateless
@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(Model model, HttpSession session ){
        return "templates/home";
    }
}
