package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MastermindController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/play")
    public String makeMovement(@RequestParam(value="colors", defaultValue="blue")List<String> colors){
        return "{\"pin\": [\"black\", \"white\"], \"isWinner\": false }";
    }

}
