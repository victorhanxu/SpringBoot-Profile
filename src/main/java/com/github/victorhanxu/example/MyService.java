package com.github.victorhanxu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    RestService restService;

    public void printService() {
        restService.callRestSevice();
        System.out.println("print service...........");
    }
}
