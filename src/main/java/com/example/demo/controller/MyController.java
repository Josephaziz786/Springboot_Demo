package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/msg")
    public String getMessage(){
        return  "Welcome in Spring Boot Application";
    }

    @GetMapping("/getMsg")
    public String fun(){
        return "This is My Testing Spring boot App";
    }

    @GetMapping("/getStudent")
    public Student getStudent(){
        Student s = new Student(1,"Manish",90.9f);
        return s;
    }



}
