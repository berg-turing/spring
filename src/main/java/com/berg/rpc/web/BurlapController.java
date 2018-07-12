package com.berg.rpc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Burlap服务的路由
 */
@Controller
@RequestMapping("/burlap")
public class BurlapController {

    @RequestMapping(value = "/service", method = RequestMethod.GET)
    @ResponseBody
    public String burlapService(){

        return "Hello, Burlap Service";
    }

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    @ResponseBody
    public String burlapCustom(){

        return "Hello, Burlap Custom";
    }
}
