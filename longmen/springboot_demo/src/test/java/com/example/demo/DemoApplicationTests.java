package com.example.demo;

import com.example.demo.beans.Company;
import com.example.demo.beans.Flow;
import com.example.demo.beans.Job;
import com.example.demo.controllers.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


//加载项目的ApplicationContext上下文环境
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private HelloController helloController;

    @Test
    public void helloControllerTest() {
        String hello = helloController.hello();
        System.out.println(hello);
    }


    @Autowired
    private Job job;

    @Test
    public void showJobInfo() {
        System.out.println(job);
    }

    @Autowired
    private Company company;

    @Test
    public void showCompanyInfo() {
        System.out.println(company);
    }


    @Autowired
    private Flow flow;

    @Test
    public void showFlowInfo() {
        System.out.println(flow);
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void iocTest() {
//        myService注意：这个名称与方法名称保持一致
        System.out.println(applicationContext.containsBean("myService"));

    }

    @Value("${tom.description}")
    private String description;

    @Test
    public void placeholderTest() {
        System.out.println(description);
    }

}
