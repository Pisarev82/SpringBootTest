package com.example.springboottest;

import org.springframework.stereotype.Component;

/**
 * Аннотация @Component не нужна при использовании xml-файла
 * Аннотация @Component добавлена для проверки конфигурирования с помощью аннотаций
 * при конфигурировании с помощью аннотаций в xml-файле указывается только пакеты для поиска @Component
 */
@Component("catBean")
public class Cat implements Pet {
    @Override
    public void say(){
        System.out.println("mau-mau");
    }
}
