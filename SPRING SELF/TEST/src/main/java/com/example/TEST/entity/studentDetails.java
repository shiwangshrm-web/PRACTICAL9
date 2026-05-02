package com.example.TEST.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="tablehi")
public class studentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String sname,sub;

}
