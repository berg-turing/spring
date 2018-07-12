package com.berg.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;

/**
 * spring mvc相关的上下文配置
 */
@Configuration
@EnableWebMvc
@ComponentScan(value = {"com.berg.spittr.web",
                        "com.berg.rpc.web"})
public class WebConfig extends WebMvcConfigurerAdapter{

    @Bean
    public HandlerMapping hessianMapping(){

        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();

        Properties mappings = new Properties();

        mappings.setProperty("/sayHello.service", "hessianServiceSayHelloExporter");

        simpleUrlHandlerMapping.setMappings(mappings);

        return simpleUrlHandlerMapping;
    }

//    @Bean
//    public HandlerMapping burlapMapping(){
//
//        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
//
//        Properties mappings = new Properties();
//
//        mappings.setProperty("/sayHello.service", "burlapServiceSayHelloExporter");
//
//        simpleUrlHandlerMapping.setMappings(mappings);
//
//        return simpleUrlHandlerMapping;
//    }

    @Bean
    public HandlerMapping httpInvokerMapping(){

        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();

        Properties mappings = new Properties();

        mappings.setProperty("/sayHello.service", "httpInvokerServiceSayHelloExporter");

        simpleUrlHandlerMapping.setMappings(mappings);

        return simpleUrlHandlerMapping;
    }


    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setExposeContextBeansAsAttributes(true);

        return viewResolver;
    }

    /**
     * 配置静态资源的处理
     *
     * @param configurer    配置对象
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        configurer.enable();
    }
}
