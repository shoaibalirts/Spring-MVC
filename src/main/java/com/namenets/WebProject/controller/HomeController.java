package com.namenets.WebProject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Namenets 1";
    }
    @RequestMapping("/about")
    public String about(){
        return "About me: This is Shoaib";
    }
}
