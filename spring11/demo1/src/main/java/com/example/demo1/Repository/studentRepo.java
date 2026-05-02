package com.example.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.Entity.Studentdetails;

public interface studentRepo extends JpaRepository<Studentdetails,Integer>{
    
}
