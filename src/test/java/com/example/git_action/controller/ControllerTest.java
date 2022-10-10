package com.example.git_action.controller;

import com.example.git_action.domain.testResponse;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(controllers = testController.class)
public class ControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    void test_getUserById_success()throws Exception{
        int id=831;
        testResponse expected = testResponse.builder().success(true).message("Your number is 831").build();
        MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get("/test/{id}","831")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        Gson gson =new Gson();
        testResponse actual=gson.fromJson(result.getResponse().getContentAsString(), testResponse.class);
        assertEquals(expected.toString(),actual.toString());
    }
}
