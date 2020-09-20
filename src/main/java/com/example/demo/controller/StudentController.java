package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentDao studentDao;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<Student> insertStudent(){
       return studentDao.selectAll();
    }

    @RequestMapping("/get")
    @ResponseBody
    public String we(){
        return "欢迎访问";
    }
}
