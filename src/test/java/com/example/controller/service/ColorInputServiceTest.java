package com.example.controller.service;

import com.example.service.ColorInputService;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ColorInputServiceTest {

    ColorInputService colorInputService = new ColorInputService();

    private  String correctInput = "{\"colors\": [\"blue\", \"orange\", \"red\", \"green\"]}";

    @Test
    public void shouldReturnPinIsWinnerTrue() throws Exception {
        //given
        String playerInput = correctInput;
        String expectedPlayResult = "{\"pin\": [\"black\", \"black\", \"black\", \"black\"], \"isWinner\": true }";

        //when
        String currentPlayResult = colorInputService.calculatePlayerMovement(playerInput);

        //then
        assertThat(currentPlayResult, is(expectedPlayResult));
    }
}
