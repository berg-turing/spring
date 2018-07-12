package com.berg.rpc.core.httpinvoker;

import com.berg.rpc.service.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class HttpInvokerServiceConfig {

    @Bean
    public HttpInvokerServiceExporter httpInvokerServiceSayHelloExporter(SayHello sayHello){

        HttpInvokerServiceExporter httpInvokerServiceExporter = new HttpInvokerServiceExporter();

        httpInvokerServiceExporter.setService(sayHello);
        httpInvokerServiceExporter.setServiceInterface(SayHello.class);

        return httpInvokerServiceExporter;
    }
}
