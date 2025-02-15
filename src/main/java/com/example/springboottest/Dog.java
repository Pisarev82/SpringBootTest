package com.example.springboottest;

public class Dog implements Pet {
    private String name;
    @Override
    public void say(){
        System.out.println("gav-gav");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
