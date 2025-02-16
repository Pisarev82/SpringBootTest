package com.example.springtest2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Война и мир")
    private String title;

    public String getTitle() {
        return title;
    }
}
