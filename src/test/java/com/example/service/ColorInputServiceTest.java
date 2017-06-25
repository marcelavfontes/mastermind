package com.example.service;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ColorInputServiceTest {

    private static final List WRONG_INPUT = asList("{\"colors\": [\"red\", \"blue\", \"blue\", \"blue\"]}");
    private static final List CORRECT_INPUT = asList("blue", "orange", "red", "green");
    public static final String WINNER_RESPONSE = "{\"pin\": [\"black\", \"black\", \"black\", \"black\"], \"isWinner\": true }";
    public static final String PIN_WHITE_WHITE_WHITE_WHITE_IS_WINNER_FALSE = "{\"pin\": [\"white\", \"white\", \"white\", \"white\"], \"isWinner\": false }";

    ColorInputService colorInputService = new ColorInputService();

    @Test
    public void shouldReturnIsWinnerTrue() throws Exception {
        //given
        List playerInput = CORRECT_INPUT;
        String expectedPlayResult = WINNER_RESPONSE;

        //when
        String currentPlayResult = colorInputService.calculatePlayerMovement(playerInput);

        //then
        assertThat(currentPlayResult, is(expectedPlayResult));
    }

    @Test
    public void shouldReturnIsWinnerFalse() throws Exception {
        //given
        List playerInput = WRONG_INPUT;
        String expectedPlayResult = PIN_WHITE_WHITE_WHITE_WHITE_IS_WINNER_FALSE;

        //when
        String currentPlayResult = colorInputService.calculatePlayerMovement(playerInput);

        //then
        assertThat(currentPlayResult, is(expectedPlayResult));
    }
}
