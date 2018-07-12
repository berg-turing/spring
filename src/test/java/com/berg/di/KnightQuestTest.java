package com.berg.di;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightQuestTest {

    /**
     * 测试从xml文件中加载应用的配置
     */
    @Test
    public void testFromXmlConfig(){

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("di/KnightQuestSpring.xml");

        Knight knight = (Knight)applicationContext.getBean("knight");

        knight.embarkOnQuest();

        applicationContext.close();
    }
}
