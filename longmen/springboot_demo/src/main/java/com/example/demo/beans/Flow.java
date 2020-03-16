package com.example.demo.beans;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:my_custom_config.properties")
@EnableConfigurationProperties(Flow.class)
@ConfigurationProperties(prefix = "flow")
public class Flow {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Flow{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
