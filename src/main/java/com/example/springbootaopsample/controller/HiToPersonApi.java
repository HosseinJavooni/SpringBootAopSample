package com.example.springbootaopsample.controller;

import com.example.springbootaopsample.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class HiToPersonApi {
    @Autowired
    ConfigurableApplicationContext applicationContext;

    @PostMapping("/hi")
    public String sayHiToPerson(@RequestBody Person request){
        ApplicationContext context = new AnnotationConfigApplicationContext();
        Person person = applicationContext.getBean(Person.class);
        person.setFirstName(request.getFirstName());
        return "Hi " + person.getFirstName();
    }
}
