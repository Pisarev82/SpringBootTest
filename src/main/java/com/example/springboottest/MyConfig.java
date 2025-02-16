package com.example.springboottest;

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
public class MyConfig {
}
