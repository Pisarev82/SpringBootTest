package com.example.springboottest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Проверка конфигрирования с помощью аннотаций
 *  конфигурирование без помощи xml файла
 *  Конфигурирование происходить в Myconfig.java
 */
public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getName() + " " + person.getAge());
        context.close();
    }
}
