package com.example.springbootaopsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy
public class SpringBootAopSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopSampleApplication.class, args);
    }

}
