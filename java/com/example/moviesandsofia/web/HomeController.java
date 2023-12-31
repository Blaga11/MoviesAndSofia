package com.example.moviesandsofia.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/about")
    public String about(){
        return "about";
    }

    @GetMapping(value = "/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/register")
    public String register(){
        return "register";
    }
}
