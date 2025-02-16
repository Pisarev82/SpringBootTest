package com.example.springboottest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Проверка конфигрирования с помощью аннотаций
 *  конфигурирование без помощи xml файла
 *  Конфигурирование происходить в Myconfig.java
 */
public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);

        Pet capybara = context.getBean("capybaraBean", Pet.class);
        capybara.say();
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        context.close();
        System.out.println(person.getName() + " " + person.getAge());
    }
}
