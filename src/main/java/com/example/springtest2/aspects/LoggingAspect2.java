package com.example.springtest2.aspects;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect2 {
    @Pointcut("execution(* get*(..))")
    private void allGetMethod() {}

    @Pointcut("execution(* return*(..))")
    private void allReturnMethod() {}

    @Pointcut("allGetMethod() || allReturnMethod()")
    private void allGetAndReturnMethod() {}


    @Pointcut("execution(* *(..))")
    private void allMethod() {}

    @Pointcut("execution(public void com.example.springtest2.Library.returnMagazine())")
    private void returnMagazineMethod() {}

    @Pointcut("allMethod() && !returnMagazineMethod()")
    private void allMethodExceptReturnMagazineFromLibraryMethod() {}

    
    @Before("allGetMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log#1");
    }

    @Before("allReturnMethod()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log#2");
    }

    @Before("allGetAndReturnMethod()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log#3");
    }

    @Before("allMethodExceptReturnMagazineFromLibraryMethod()")
    public void beforeMethodExceptReturnMagazineFromLibraryMethod() {
        System.out.println("beforeMethodExceptReturnMagazineFromLibraryMethod: writing log#4");
    }
}
