package com.berg.rpc.core.httpinvoker;

import com.berg.rpc.service.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class HttpInvokerCustomConfig {

    @Bean
    public HttpInvokerProxyFactoryBean httpInvokerProxySayHelloFactoryBean(){

        HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean();

        httpInvokerProxyFactoryBean.setServiceUrl("http://localhost:8080/sayHello.service");
        httpInvokerProxyFactoryBean.setServiceInterface(SayHello.class);

        return httpInvokerProxyFactoryBean;
    }
}
