package com.spb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleHomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
