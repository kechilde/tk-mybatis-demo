package com.example.demo;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = DemoApplication.class)
@Component
class DemoApplicationTests {
    @Resource
    private StudentDao studentDao;

    @Test
    void contextLoads() {
//        Student student = new Student();
//        student.setStudentId("17130106Y04");
//        student.setName("刘1");
//        student.setAge(24);
//
//        studentDao.insert(student);
//
    }

}
