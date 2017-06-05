package com.fred.lesson.consumer.controller;

import com.fred.lesson.api.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        return helloService.sayHello("fred");
    }

}
