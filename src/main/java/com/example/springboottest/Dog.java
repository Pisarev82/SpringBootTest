package com.example.springboottest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Аннотация @Scope("prototype") позволяет создавать несколько экземпляров бина
 */
@Component
@Scope("prototype")
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
