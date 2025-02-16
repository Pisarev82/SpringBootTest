package com.example.springtest2;

import org.springframework.stereotype.Component;


@Component
public class LibraryEe extends AbstractLibrery {

    @Override
    public void getBook() {
        System.out.println("LibreryEe берем книгу \n ");
    }
}
