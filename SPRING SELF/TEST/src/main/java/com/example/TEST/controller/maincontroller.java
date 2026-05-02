package com.example.TEST.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TEST.Repository.studentRepo;
import com.example.TEST.entity.studentDetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class maincontroller {
   @Autowired
   studentRepo obj;
   @GetMapping("/details")
   public List<studentDetails> getMethodName() {
       return obj.findAll();
   }
   @PostMapping("/details")
   public studentDetails postMethodName(@RequestBody studentDetails entity)throws IOException {
       FileWriter file = new FileWriter("TEST/src/main/resources/static/text.txt",true);    
       String data ;
       data = entity.getSname()+"\n"+entity.getSub()+"\n"+"__________"+"\n";
       file.write(data);
       file.close();
       return obj.save(entity);
   }
   
}
