package com.example.springtest2.secondVersion;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class ExceptionHandlingAspect {

    @Before("com.example.springtest2.secondVersion.myPointcuts.allAddMethod()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: handling exceptions#1 \n");
    }

}
