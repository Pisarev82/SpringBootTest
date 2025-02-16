package com.example.springboottest;

import org.springframework.stereotype.Component;

/**
 * Аннотация @Component не нужна при использовании xml-файла
 * Аннотация @Component добавлена для проверки конфигурирования с помощью аннотаций
 * при конфигурировании с помощью аннотаций в xml-файле указывается только пакеты для поиска @Component
 * id в аннотации не обязательно указывать. В этом случае id будет равен имени класса с маленькой буквы.
 * Есть исключение если название класса ABCClass то id будет ABCClass
 */
@Component("catBean")
public class Cat implements Pet {
    @Override
    public void say(){
        System.out.println("mau-mau");
    }
}
