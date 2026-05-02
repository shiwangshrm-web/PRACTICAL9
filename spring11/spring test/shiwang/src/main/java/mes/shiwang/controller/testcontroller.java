package mes.shiwang.controller;

import org.springframework.web.bind.annotation.RestController;

import mes.shiwang.DTO.testDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/apipost")
@RestController
public class testcontroller {
    @GetMapping("/TEST")
    public testDTO getMethodName() {
       
         testDTO sc = new testDTO();
         sc.setDiv(1);
         sc.setId(1);
         sc.setWork("manager");
         sc.setNaame("shiwang");  
          return sc;
   }
   @PostMapping("/post")
   public testDTO postMethodName(@RequestBody testDTO DTO) { 
       return DTO;
   }}
