package com.berg.rpc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hessian的服务路由
 */
@Controller
@RequestMapping("/hessian")
public class HessianController {

    @RequestMapping(value = "/service", method = RequestMethod.GET)
    @ResponseBody
    public String hessianService(){

        return "Hello, Hessian Service";
    }

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    @ResponseBody
    public String hessianCustom(){

        return "Hello, Hessian Custom";
    }
}
