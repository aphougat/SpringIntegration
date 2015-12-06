package com.itembryo.service;

/**
 * Created by abhayphougat on 06/12/15.
 */
public class DefaultHelloService implements HelloService{

    public String sayHello(String name) {
        return "Hello "+name;
    }
}
