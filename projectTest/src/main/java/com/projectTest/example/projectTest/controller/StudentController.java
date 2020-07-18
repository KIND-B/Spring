package com.projectTest.example.projectTest.controller;

import com.projectTest.example.projectTest.entity.StudentsEntity;
import com.projectTest.example.projectTest.repository.StudentRepository;
import com.projectTest.example.projectTest.service.studentimpl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("Student")
@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;


//    @RequestMapping("/hello1")
//    public String hello(){
//    return "tahukanna";
//    }
//
//    @RequestMapping("/hello")
    @GetMapping("employees")
    public List<StudentsEntity> all()
    {
        return studentRepository.findAll();
    }



}
