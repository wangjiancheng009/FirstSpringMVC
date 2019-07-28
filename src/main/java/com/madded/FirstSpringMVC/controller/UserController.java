package com.madded.FirstSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madded.FirstSpringMVC.entity.User;


@Controller
public class UserController {
    

    @RequestMapping(value="/register")
    public String Register(@ModelAttribute("form") User user, Model model) { 
        model.addAttribute("user", user);
        return "success";
    }
}