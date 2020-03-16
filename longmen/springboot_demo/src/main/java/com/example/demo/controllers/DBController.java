package com.example.demo.controllers;

import com.example.demo.services.DBConnecter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
    @Autowired
    private DBConnecter dbConnecter;

    @GetMapping("/showDB")
    public String showDB() {
     return   dbConnecter.configure();
    }
}
