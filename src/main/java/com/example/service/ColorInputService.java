package com.example.service;


import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class ColorInputService {

    private final List CORRECT_INPUT = asList("blue", "orange", "red", "green");

    public String calculatePlayerMovement(List<String> playerInput) {

        boolean isCorrectInput = playerInput.equals(CORRECT_INPUT);

        String cc ="{\"pin\": [\"black\", \"black\", \"black\", \"black\"], \"isWinner\": true }";
        return isCorrectInput ? cc : "{\"pin\": [\"white\", \"white\", \"white\", \"white\"], \"isWinner\": false }" ;
    }
}
