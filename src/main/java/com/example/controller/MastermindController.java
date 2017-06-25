package com.example.controller;

import com.example.requestresource.ColorsRequestResource;
import com.example.service.ColorInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MastermindController {

    @Autowired
    ColorInputService colorInputService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/play")
    public String makeMovement(@RequestBody ColorsRequestResource colorsRequestResource){
        List<String> inputColors = colorsRequestResource.getColors();
        String response = colorInputService.calculatePlayerMovement(inputColors);
        return response;
    }

}
