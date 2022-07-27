package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonneController {
    @GetMapping("/personne")
    public String vuePersonne(){
        return "personne";

    }

}
