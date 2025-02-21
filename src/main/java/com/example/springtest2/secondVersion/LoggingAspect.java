package com.example.springtest2.secondVersion;

import com.example.springtest2.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class LoggingAspect {


    @Before("com.example.springtest2.secondVersion.myPointcuts.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        if (methodSignature.getMethod().getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if (arg instanceof Book) {
                    Book book = (Book) arg;
                    System.out.println("Инфо о книге: "
                            + book.getTitle() + " "
                            + book.getAuthor() + " "
                            + book.getYearOfPublication());
                } else {
                    System.out.println("Добавил " + arg);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: writing log#1 \n");
    }
}
