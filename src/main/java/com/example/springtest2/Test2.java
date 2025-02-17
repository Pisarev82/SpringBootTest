package com.example.springtest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.springtest2");

        Library library = context.getBean(Library.class);
        library.getBook();
        library.returnMagazine();
        library.addBook();

        context.close();
    }
}
