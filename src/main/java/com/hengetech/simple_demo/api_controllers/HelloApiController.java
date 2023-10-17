package com.hengetech.simple_demo.api_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello";
    }
}
