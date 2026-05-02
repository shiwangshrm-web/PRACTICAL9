package com.example.demo1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class jaincontroller {
    
@GetMapping("/index")
public String getMethodName() {
    return "index";
}

    
}
