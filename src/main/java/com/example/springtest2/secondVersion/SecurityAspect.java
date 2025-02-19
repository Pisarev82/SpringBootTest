package com.example.springtest2.secondVersion;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(-5)
public class SecurityAspect {
    @Before("com.example.springtest2.secondVersion.myPointcuts.allAddMethod()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: Security#1 \n");
    }
}
