package com.fred.lesson.provider.service;

import com.fred.lesson.api.HelloService;

/**
 * Created by fred on 6/5/17.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
