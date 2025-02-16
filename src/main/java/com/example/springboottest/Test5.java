package com.example.springboottest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Проверка конфигрирования с помощью аннотаций
 * при конфигурировании с помощью аннотаций в xml-файле указывается только пакеты для поиска @Component
 */
public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getName() + "\n" + person.getAge());

        Dog dog = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);
        dog.setName("Белка");
        dog2.setName("Стрелка");
        System.out.println(dog.getName() + " " + dog2.getName());

        context.close();
    }
}
