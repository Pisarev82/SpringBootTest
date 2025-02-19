package com.example.springtest2.secondVersion;

import org.aspectj.lang.annotation.Pointcut;

public class myPointcuts {

    @Pointcut("execution(* add*(..))")
    public void allAddMethod() {}

}
