package com.berg.rpc.service.impl;

import com.berg.rpc.service.SayHello;

public class SayHelloImpl implements SayHello{

    @Override
    public String sayHello(String name) {

        System.out.println(name + ", hello !!!");

        return "finished it";
    }
}
