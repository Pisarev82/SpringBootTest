package com.example.springboottest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Конфигурация с помощью @Configuration
 *
 */

@Configuration
@ComponentScan("com.example.springboottest")
@PropertySource("classpath:application.properties")
public class MyConfig2 {
    @Bean
    public Pet capybaraBean() {
        return new Capybara();
    }
    @Bean
    public Person personBean() {
        return new Person(capybaraBean());
    }
}

