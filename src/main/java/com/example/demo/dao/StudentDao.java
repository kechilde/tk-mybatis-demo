package com.example.demo.dao;


import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends SuperMapper<Student> {

}
