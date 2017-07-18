package com.shaoqing.rpc.sample.server;

import com.shaoqing.rpc.sample.api.HelloService;
import com.shaoqing.rpc.sample.api.Person;
import com.shaoqing.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
