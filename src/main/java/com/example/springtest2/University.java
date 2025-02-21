package com.example.springtest2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student1 = new Student("Nikolay", 6, 4.8);
        students.add(student1);
        Student student2 = new Student("Ivan", 6, 4.8);
        students.add(student2);
        Student student3 = new Student("Vasiliy", 1, 4.0);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("from method getStudents()");
        // Ошибка допущена специально для тестирования @AfterThrowing
        students.add(students.get(4));
        System.out.println(students);
        return students;
    }
}
