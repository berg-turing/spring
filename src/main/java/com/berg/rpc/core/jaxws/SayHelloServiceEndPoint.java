package com.berg.rpc.core.jaxws;

import com.berg.rpc.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component
@WebService(serviceName = "sayHello")
public class SayHelloServiceEndPoint{

    @Autowired
    private SayHello sayHello;

    @WebMethod
    public void sayHello(){

        sayHello.sayHello("Web Service End Point");
    }
}
