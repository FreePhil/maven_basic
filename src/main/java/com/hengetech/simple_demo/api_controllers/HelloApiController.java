package com.hengetech.simple_demo.api_controllers;

import com.hengetech.simple_demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

    @GetMapping("/api/hello")
    public String hello() {
        var user = new User();
        user.setName("Henge");
        return "Hello";
    }

}
