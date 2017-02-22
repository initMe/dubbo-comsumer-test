package com.fish.comsumer;

import com.fish.api.HelloApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by YuChi.Yu on 2017/2/22.
 */
public class Comsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring-application.xml" });
        context.start();

        HelloApi helloApi = (HelloApi)context.getBean("helloApi");
        System.out.println(helloApi.sayHello("dubbo-test"));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
