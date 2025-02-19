package com.example.springtest2;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Library extends AbstractLibrery{
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из Library \n");
    }

    public void getBook(String bookName) {
        System.out.printf("Мы берем книгу %s из Library %n %n", bookName);
    }

    public void getBook(Book book) {
        System.out.printf("Мы берем книгу %s из Library %n %n", book.getTitle());
    }

    protected String returnBook() {
        return "Мы возвращаем книгу в Library \n ";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из Library \n ");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в Library \n ");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в Library \n ");
        System.out.println("------------------------------ \n");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в Library \n ");
        System.out.println("------------------------------ \n");
    }
}
