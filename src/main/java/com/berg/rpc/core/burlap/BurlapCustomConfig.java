package com.berg.rpc.core.burlap;

import com.berg.rpc.service.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapProxyFactoryBean;

@Configuration
public class BurlapCustomConfig {

    @Bean
    public BurlapProxyFactoryBean burlapProxySayHelloFactoryBean(){

        BurlapProxyFactoryBean burlapProxyFactoryBean = new BurlapProxyFactoryBean();

        burlapProxyFactoryBean.setServiceUrl("http://localhost:8080/sayHello.service");
        burlapProxyFactoryBean.setServiceInterface(SayHello.class);

        return burlapProxyFactoryBean;
    }
}
