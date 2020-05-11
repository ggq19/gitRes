package com.ggq.springboot02.controller;

import com.ggq.springboot02.entity.Sutdent;
import com.ggq.springboot02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    StudentService stuService;
    @GetMapping("/login")
    public  String login(){
        System.out.println("++++++++get++++++++++");

        return "login";
    }
    @PostMapping("/login")
    public String loginp(Sutdent sutdent){
        System.out.println("++++++++post++++++++++");
        System.out.println(sutdent);
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
