package com.example.demo.controllers;

import com.example.demo.beans.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        Job job=new Job();
        System.out.println(job.getName());
        return "hello Spring Boot";
    }
}

