package com.berg.nosql.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = RedisConfig.class)
public class RedisTest {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
    public void testRedis(){
//
//        redisTemplate.opsForValue().set("test", "redis test");
//
//        System.out.println(redisTemplate.opsForValue().get("test"));
    }
}
