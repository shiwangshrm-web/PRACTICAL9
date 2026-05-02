package mes.shiwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class maincontroller {
    @GetMapping("/path")
    public String getMethodName() {
        return "index";
    }

    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {
        
        
        return entity;
    }
    

}
