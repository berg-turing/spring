package com.berg.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Aspect
@Component
public class Minstrel {

    private PrintStream stream;

    @Autowired
    public Minstrel(PrintStream stream){

        this.stream = stream;
    }

    @Pointcut(value = "execution(* *.embarkOnQuest(..))")
    public void embark(){}

    @Before("embark()")
    public void singBeforeQuest(){

        stream.println("before");
    }

    @After("embark()")
    public void singAfterQuest(){

        stream.println("after");
    }
}
