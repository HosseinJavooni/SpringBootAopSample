package com.example.springbootaopsample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    @Pointcut("execution(* com.example.springbootaopsample.controller.FakeApi1.sayHi3())")
//    public void pointCutSample(){}

    @Before("execution(public String com.example.springbootaopsample.controller.FakeApi.sayHi())")
    public void doSomeBefore(){
        System.out.println("This is Before Advise in aspect!...");
    }

    @After("execution(* com.example.springbootaopsample.controller.FakeApi.sayBay())")
    public void doSomeAfter(){
        System.out.println("This is After Advise in aspect!...");
    }

    //Before aspect on any method with name "sayBay"
    @Before("execution(* sayBay())")
    public void doSomeBefore2(){
        System.out.println("This is Before Advise 2 in aspect!...");
    }

    //After aspect on any method that name is start with "say"
    @After("execution(* say*())")
    public void doSomeAfter2(){
        System.out.println("This is After Advise 2 in aspect!...");
    }

//    @After("execution(* com.example.springbootaopsample.controller.*.*(..))")
//    public void doSomeAfter3(){
//        System.out.println("This is After 3 in aspect!...");
//    }

    @Before("execution(* com.example.springbootaopsample.controller.*.*())")
    public void doSomeBefore3(){
        System.out.println("This is Before 3 in aspect!...");
    }

    @After("com.example.springbootaopsample.aspect.PointCutSample.pointCutSample()")
    public void doSomeAfter4(){
        System.out.println("Test PointCut!...");
    }
}
