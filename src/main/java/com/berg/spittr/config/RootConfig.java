package com.berg.spittr.config;

import com.berg.rpc.service.SayHello;
import com.berg.rpc.service.impl.SayHelloImpl;
import org.springframework.context.annotation.*;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 非spring mvc相关的上下文
 */
@Configuration
@ComponentScan(
        basePackages = {"com.berg.spittr",
                "com.berg.rpc.core"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        }
)
public class RootConfig {

    @Bean
    public SayHello sayHello(){

        return new SayHelloImpl();
    }

    @Bean
    public SimpleJaxWsServiceExporter simpleJaxWsServiceExporter(){

        SimpleJaxWsServiceExporter simpleJaxWsServiceExporter = new SimpleJaxWsServiceExporter();

        simpleJaxWsServiceExporter.setBaseAddress("http://localhost:8888/webServices/");

        return simpleJaxWsServiceExporter;
    }
}
