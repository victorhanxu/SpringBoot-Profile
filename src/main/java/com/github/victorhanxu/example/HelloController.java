package com.github.victorhanxu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    MyService myService;

    @GetMapping("/")
    public String index() {
        myService.printService();
        return "Hello, this is from Spring Boot!!!";
    }

}