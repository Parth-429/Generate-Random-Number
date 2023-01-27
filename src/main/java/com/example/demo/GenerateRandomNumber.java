package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class GenerateRandomNumber {
    @GetMapping("/")
    public String GenerateRandomNumber(){
        return "Get your random Number: \n" + Integer.toString(ThreadLocalRandom.current().nextInt(0,Integer.MAX_VALUE));
    }
}
