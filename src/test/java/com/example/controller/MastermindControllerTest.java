package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MastermindControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldReturnExpectedStringWhenAccessingIndex() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }

    @Test
    public void shouldReturnStatusOkWhenAccessingPlayEndpoint() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/play").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnSimpleResponseWhenSimplePlayIsMade() throws Exception {
            mvc.perform(MockMvcRequestBuilders.post("/play")
                    .param("colors", "{\"colors\": [\"blue\", \"red]\", \"yellow\", \"purple\"]}")
                    .accept(MediaType.APPLICATION_JSON))
                    .andExpect(content().string(equalTo("{\"pin\": [\"black\", \"white\"], \"isWinner\": false }")));
    }
}