package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/helloworld")
public class HelloGreetController {


    @GetMapping
    public String sayHello(){
        return "Hello World";
    }
}
