package com.example.sampleSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping({"","/"})
    public String goToLogin(){
        return "login";
    }

    @PostMapping("login")
    public String checkLogin(){
        return "index";
    }


    //@PostMapping
}
