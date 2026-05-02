package com.example.TEST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TEST.entity.studentDetails;

public interface studentRepo extends JpaRepository<studentDetails,Integer>{
    
}
