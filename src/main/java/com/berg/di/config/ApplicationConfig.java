package com.berg.di.config;

import com.berg.aop.Minstrel;
import com.berg.di.Knight;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.PrintStream;

@Configurable
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {Minstrel.class, Knight.class})
public class ApplicationConfig {

    @Bean
    public PrintStream stream(){

        return System.out;
    }
}
