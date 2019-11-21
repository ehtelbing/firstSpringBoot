package com.sboot.first.controller;

import com.sboot.first.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication
@RequestMapping("/test/")
public class hello {
    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public String retString(){
       return helloService.retTest();
    }

}
