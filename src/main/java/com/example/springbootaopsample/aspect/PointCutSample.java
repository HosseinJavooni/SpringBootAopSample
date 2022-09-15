package com.example.springbootaopsample.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutSample {
    @Pointcut("execution(* com.example.springbootaopsample.controller.FakeApi1.sayHi3(..))")
    public void pointCutSample(){}
}
