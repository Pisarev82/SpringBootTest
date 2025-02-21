package com.example.springtest2;

import org.springframework.context.annotation.Configuration;

public class Student {
    private String name;
    private int course;
    private double avrGrade;

    public Student(String name, int course, double avrGrade) {
        this.name = name;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvrGrade(double avrGrade) {
        this.avrGrade = avrGrade;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
