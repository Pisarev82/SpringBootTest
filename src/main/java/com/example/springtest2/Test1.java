package com.example.springtest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean(Library.class);
        library.getBook();
        LibraryEe library2 = context.getBean(LibraryEe.class);
        library2.getBook();
        library.getMagazine();
        System.out.println(library.returnBook());
        library.getBook("Капиталл");
        Book book = context.getBean(Book.class);
        library.getBook(book);

        context.close();
    }
}
