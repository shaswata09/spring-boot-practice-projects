package com.leonardo.example.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String getHelloWorldString() {
        return "Hello World...";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean getHelloWorldBean() {
        return new HelloWorldBean("Hello World...");
    }
}
