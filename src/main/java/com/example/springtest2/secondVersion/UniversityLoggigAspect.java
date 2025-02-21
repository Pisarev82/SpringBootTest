package com.example.springtest2.secondVersion;

import com.example.springtest2.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggigAspect {

    @Pointcut("execution(* com.example.springtest2.University.getStudents(..))")
    public void getStudents() {}


    @Before("getStudents()")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов " +
                "Перед методом getStudents");
    }

    @AfterReturning(
            pointcut = "getStudents()",
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов " +
                "После метода getStudents");
        Student student1 = students.get(0);
        student1.setName("г-н " + student1.getName());
    }

    @AfterThrowing (
            pointcut ="getStudents()",
            throwing = "ex")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable ex) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: Словили исключение " + ex.getMessage());
    }

    @After("getStudents()")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice");
    }
}
