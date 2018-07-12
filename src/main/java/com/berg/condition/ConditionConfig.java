package com.berg.condition;

import com.berg.condition.impl.SayHelloImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(value = {SayHelloCondition.class})
    public SayHello sayHello(){

        return new SayHelloImpl();
    }
}
