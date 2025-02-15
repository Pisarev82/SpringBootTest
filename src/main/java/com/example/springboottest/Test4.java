package com.example.springboottest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * При создании бина без указания scope, используется scope по умолчанию: singleton.
 * Если нужно несколько экземпляров бина то следует указать scope prototype.
 */
public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog1 =context.getBean("myPet", Dog.class);
        Dog dog2 =context.getBean("myPet", Dog.class);

        System.out.println(dog1 == dog2);
        System.out.println(dog1);
        System.out.println(dog2);
        dog1.setName("Belka");
        dog2.setName("Strelka");
        System.out.println(dog1.getName() + " " + dog2.getName());

        context.close();
    }
}
