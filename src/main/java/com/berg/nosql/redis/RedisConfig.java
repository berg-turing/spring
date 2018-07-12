package com.berg.nosql.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory redisConnectionFactory(){

        //RedisConnectionFactory
        return new JedisConnectionFactory();
    }

    @Bean
    public <K, V> RedisTemplate<K, V> redisTemplate(RedisConnectionFactory redisConnectionFactory){

        //创建RedisTemplate
        RedisTemplate<K, V> redisTemplate = new RedisTemplate<>();

        //设置Redis工厂
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        //返回结果
        return redisTemplate;
    }
}
