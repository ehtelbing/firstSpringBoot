package com.sboot.first.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/test/")
public class hello {
    @RequestMapping("hello")
    public String retString(){
        return "Hello this my first Spring Boot";
    }

}
