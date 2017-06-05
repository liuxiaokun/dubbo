package com.fred.lesson.provider.service;

import com.fred.lesson.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by fred on 6/5/17.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
