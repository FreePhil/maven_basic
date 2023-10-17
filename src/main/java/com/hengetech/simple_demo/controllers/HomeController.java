package com.hengetech.simple_demo.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hengetech.simple_demo.model.User;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/content1")
    public String getContent1(Model model, @RequestParam(value="name", required=false) String name) {
        var protectedName = Optional.ofNullable(name);
        
        var user = new User();
        user.setName(protectedName.orElseGet(()-> "World"));
        user.setAge(15);
        user.setBirthState("Arkansas");

        model.addAttribute("user", user);
        return "content1";
    }
}
