package com.berg.rpc.core.rmi;

import com.berg.rpc.service.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

//@Configuration
public class RmiServiceConfig {

    @Bean
    public RmiServiceExporter rmiServiceExporter(SayHello sayHello){

        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();

        rmiServiceExporter.setServiceName("rmiServiceSayHello");
        rmiServiceExporter.setService(sayHello);
        rmiServiceExporter.setServiceInterface(SayHello.class);

        return rmiServiceExporter;
    }
}
