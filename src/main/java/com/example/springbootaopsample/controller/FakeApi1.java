package com.example.springbootaopsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class FakeApi1 {

    @GetMapping("/hi2")
    public String sayHi2(){
        return "Hi2";
    }

    @GetMapping("/bay2")
    public String sayBay(){
        return "bay2";
    }

    @GetMapping("/hi3")
    public String sayHi3(boolean test){
        return test + " --> Hi3";
    }

}
