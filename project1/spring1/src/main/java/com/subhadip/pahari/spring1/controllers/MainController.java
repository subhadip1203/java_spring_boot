package com.subhadip.pahari.spring1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String helloWorld() {
        return "wellcome to the world !! ";
    }
}
