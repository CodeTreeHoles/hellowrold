package com.example.hellowrold.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class hello {

    @GetMapping("")
    public String hello(){
        System.out.println("hello java");
        return ">>>>>>>>>>OK>>>>>>>>>>>>";
    }
}
