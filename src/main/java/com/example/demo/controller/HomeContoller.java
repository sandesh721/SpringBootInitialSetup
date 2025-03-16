package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeContoller {
    
    @RequestMapping("/")
    public String home() {
        return "NewFile1"; // This works for HTML in src/main/resources/static
    }
    
    @RequestMapping("/register")
    public String register() {
        return "register"; // For JSP, must be inside /WEB-INF/views/
    }
}
