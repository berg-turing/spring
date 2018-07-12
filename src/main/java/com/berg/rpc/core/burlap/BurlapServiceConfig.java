package com.berg.rpc.core.burlap;

import com.berg.rpc.service.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapServiceExporter;

//@Configuration
public class BurlapServiceConfig {

    @Bean
    public BurlapServiceExporter burlapServiceSayHelloExporter(SayHello sayHello){

        BurlapServiceExporter burlapServiceExporter = new BurlapServiceExporter();

        burlapServiceExporter.setService(sayHello);
        burlapServiceExporter.setServiceInterface(SayHello.class);

        return burlapServiceExporter;
    }
}
