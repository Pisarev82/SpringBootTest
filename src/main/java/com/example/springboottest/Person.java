package com.example.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Autowired может быть применена к конструктору, любому методу и полю класса
 * @Qualifier должна быть применена если бинов несколько
 */

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;

    @Value("Nikolay")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(){

    }
/**
 * Если в классе только один конструктор, то аннотация @Autowired не обязательна.
 * Зависимость все равно будет установлена.
 * Аннотация @Qualifier в конструкторе прописывается в параметрах
* */
    @Autowired
    public Person(@Qualifier("dog")Pet pet) {
        this.pet = pet;
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void callPet(){
        System.out.println("call pet");
        pet.say();
    }
}
