package com.example.springboottest;

public class Person {
    private Pet pet;
    private String name;
    private int age;

    public Person(){

    }
    public Person(Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
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
