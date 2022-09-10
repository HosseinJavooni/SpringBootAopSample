package com.example.springbootaopsample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public String com.example.springbootaopsample.controller.FakeApi.sayHi())")
    public void doSomeBefore(){
        System.out.println("This is Before Advise in aspect!...");
    }

    @After("execution(* com.example.springbootaopsample.controller.FakeApi.sayBay())")
    public void doSomeAfter(){
        System.out.println("This is After Advise in aspect!...");
    }
}
