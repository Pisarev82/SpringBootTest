package com.example.springboottest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml", Pet.class);
        Pet pet = (Pet) context.getBean("myPet");
        pet.say();

        context.close();
    }
}
