package com.example.springtest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.springtest2");

        Library library = context.getBean(Library.class);
        library.getMagazine();
        library.getBook();
        library.returnMagazine();

        Book book = context.getBean(Book.class);
        library.addBook("Nikolay", book);
        library.addMagazine();

        context.close();
    }
}
