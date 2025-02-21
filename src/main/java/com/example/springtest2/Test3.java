package com.example.springtest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.example.springtest2");

        University university = context.getBean(University.class);
        university.addStudent();
        List<Student> students = new ArrayList<>();
        try {
            students = university.getStudents();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println(students);

        context.close();
    }
}
