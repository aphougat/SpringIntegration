package com.itembryo;

import com.itembryo.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        String cfg = "classpath:*context.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(cfg);
        HelloService helloService = context.getBean("helloGateway", HelloService.class);
        System.out.println(helloService.sayHello("World"));
    }
}
