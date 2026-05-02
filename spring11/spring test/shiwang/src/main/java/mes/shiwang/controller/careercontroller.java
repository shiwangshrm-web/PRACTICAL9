package mes.shiwang.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mes.shiwang.DTO.carrer;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/apii")
public class careercontroller {
    @PostMapping("/path")
    public carrer postMethodName(@RequestBody carrer DTO) {
        //TODO: process POST request
        
        return DTO;
    }
    
    
}
