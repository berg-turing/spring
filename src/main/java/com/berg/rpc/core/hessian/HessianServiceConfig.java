package com.berg.rpc.core.hessian;

import com.berg.rpc.service.SayHello;
import com.berg.rpc.service.impl.SayHelloImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

@Configuration
public class HessianServiceConfig {

    @Bean
    public HessianServiceExporter hessianServiceSayHelloExporter(SayHello sayHello){

        HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();

        hessianServiceExporter.setService(sayHello);
        hessianServiceExporter.setServiceInterface(SayHello.class);

        return hessianServiceExporter;
    }
}
