package com.example.springbootaopsample.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectOrder2 {
    @Pointcut("execution(* com.example.springbootaopsample.controller.*.*(..))")
    public void pointCutForAllControllers(){}
    @Pointcut("execution(* com.example.springbootaopsample.model.*.*(..))")
    public void pointCutForAllModels(){}

    @Before("pointCutForAllModels()")
    public void doForAllModels(){
        System.out.println("doForAllModels() in aspect2!...");
    }
}
