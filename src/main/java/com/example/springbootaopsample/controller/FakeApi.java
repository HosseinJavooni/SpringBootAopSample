package com.example.springbootaopsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FakeApi {
    @GetMapping("/hi")
    public String sayHi(){
        System.out.println("this is sayHi in FakeApi!");
        return "Hi!";
    }

    @GetMapping("/bay")
    public String sayBay(){
        System.out.println("this is sayBay in FakeApi!");
        return "Bay!";
    }
}
