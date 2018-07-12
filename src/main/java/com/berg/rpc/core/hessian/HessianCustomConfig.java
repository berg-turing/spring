package com.berg.rpc.core.hessian;

import com.berg.rpc.service.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class HessianCustomConfig {

    @Bean
    public HessianProxyFactoryBean hessianProxySayHelloFactoryBean(){

        HessianProxyFactoryBean hessianProxyFactoryBean = new HessianProxyFactoryBean();

        hessianProxyFactoryBean.setServiceUrl("http://localhost:8080/sayHello.service");
        hessianProxyFactoryBean.setServiceInterface(SayHello.class);

        return hessianProxyFactoryBean;
    }
}
