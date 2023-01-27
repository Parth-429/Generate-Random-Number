package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class welcome {
    @GetMapping("/")
    public String welcome(){
        return "Get your random Number: \n" + Integer.toString(ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
