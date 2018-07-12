package com.berg.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConditionConfig.class})
public class ConditionTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testCondition(){

        SayHello sayHello = applicationContext.getBean(SayHello.class);

        System.out.println(sayHello);
    }
}
