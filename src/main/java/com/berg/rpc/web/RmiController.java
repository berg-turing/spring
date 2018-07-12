package com.berg.rpc.web;

import com.berg.rpc.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rmi")
public class RmiController {

    @Qualifier("rmiServiceSayHello")
    private SayHello rmiServiceSayHello;

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    @ResponseBody
    public String rmiCustom(){

        System.out.println("Custom: " + rmiServiceSayHello.sayHello("Custom"));

        return "Hello, Rmi Custom";
    }
}
