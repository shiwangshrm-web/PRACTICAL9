package com.example.TEST.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class htmlcontrolle {
    @RequestMapping("/path")
    public String requestMethodName() {
        return "index";
    }
    
}
