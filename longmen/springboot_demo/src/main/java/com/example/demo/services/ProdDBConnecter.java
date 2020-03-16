package com.example.demo.services;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")   // 指定多环境配置类标识
public class ProdDBConnecter implements DBConnecter {
    @Override
    public String configure() {
        return "数据库配置环境prod";
    }
}