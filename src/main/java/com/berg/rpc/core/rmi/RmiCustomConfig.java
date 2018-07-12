package com.berg.rpc.core.rmi;

import com.berg.rpc.service.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

//@Configuration
public class RmiCustomConfig {

    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean(){

        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();

        rmiProxyFactoryBean.setServiceUrl("rmi://localhost/rmiServiceSayHello");
        rmiProxyFactoryBean.setServiceInterface(SayHello.class);


        return rmiProxyFactoryBean;
    }
}
