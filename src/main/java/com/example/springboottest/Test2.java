package com.example.springboottest;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
* Создаем контекст, который использует xml конфигурацию
* Создаем ссылку на Bean который получаем из контекста
* */
public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = (Pet) context.getBean("myPet");
        pet.say();

        context.close();
    }
}
