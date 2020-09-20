package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "tb_student")
public class Student {
    @Id
    private Integer id;
    private String studentId;
    private String name;
    private Integer age;
}
