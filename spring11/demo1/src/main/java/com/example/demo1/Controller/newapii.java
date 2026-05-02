package com.example.demo1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.Entity.Studentdetails;
import com.example.demo1.Repository.studentRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class newapii {

   @Autowired
    studentRepo  obj;
@GetMapping("/details")
public List<Studentdetails> getDetails() {
    return obj.findAll();
}
 @PostMapping("/details")
 public Studentdetails postMethodName(@RequestBody Studentdetails Entity) {
     return obj.save(Entity) ;
 }
    
}
