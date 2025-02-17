package com.example.springtest2.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Аннотация @Aspect
 * Для использования должен быть установлена зависивость AspectJ weaver
 * Pointcut - точка входа указывается в аннотации @Before
 */
//@Component
//@Aspect
public class LoggingAspect {
    /**
     * Варианты @Before
     *
     * @Before("execution(public void getBook())")
     * подходит для всех методов void getBook()
     *
     * @Before("execution(public void com.example.springtest2.Library.getBook())")
     * подходит для метода void getBook() в классе Library
     *
     * @Before("execution(public void get*())")
     * подходит для всех методов начинающихся на get.... находязихся в области
     * видимости @ComponentScan("com.example.springtest2")
     *
     * @Before("execution(public * returnBook())")
     * Подходит для всех возвращаемых типов включая void
     * Подходит для всех аксес модефаеров
     *
     * @Before("execution(public void get*(*))")
     * Подходит для всех методов с 1 любим параметром.
     *
     * @Before("execution(* returnBook(..))")
     * Подходит для всех методов без параметров и с любым количеством любых параметров.
     */

    @Pointcut("execution(* get*())")
    private void allGetMethod() {}

    @Before("allGetMethod()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice Попытка получить книгу || Журнал");
    }

    @Before("execution(public void get*(com.example.springtest2.Book))")
    public void beforeGetBookAdviceWithStringParameter(){
        System.out.println("beforeGetBookAdvice Попытка получить книгу");
    }

    @Before("execution(* returnBook(..))")
    public void beforeReturnBook(){
        System.out.println("beforeReturnBook Попытка вернуть книгу");
    }

    @Before("allGetMethod()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice проверка прав на получение книги || журнала");
    }

}

