package com.sboot.first.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class HelloService {

    public String retTest(){
        return "Hello this my first Spring Boot";
    }

}
