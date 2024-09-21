package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String home(HttpServletRequest request) {
        return "Welcome to the home page " + request.getSession().getId();
    }

}
