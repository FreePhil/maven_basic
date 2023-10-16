package com.hengetech.simple_demo.api_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hengetech.simple_demo.model.Gi;
import com.hengetech.simple_demo.repos.GiRepo;

@RestController
public class GiController {
    private GiRepo giRepo;

    public GiController(GiRepo giRepo) {
        this.giRepo = giRepo;
    }

    @GetMapping("/gi/fix-wired")
    public Gi getOne() {
        var jobNo = "OUT20061000048";
        var one = giRepo.findById(jobNo).orElseGet(() -> new Gi());
        return one;
    }
}
