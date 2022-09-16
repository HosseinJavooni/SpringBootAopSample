package com.example.springbootaopsample.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        System.out.println("getFirstName()");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("setFirstName()");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
