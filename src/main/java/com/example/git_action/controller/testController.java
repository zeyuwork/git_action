package com.example.git_action.controller;

import com.example.git_action.domain.testResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@RestController
@RequestMapping("test")
public class testController {
    @GetMapping("/{id}")
    public ResponseEntity<testResponse> getUserbyId(@PathVariable int id) {
        return ResponseEntity.ok(testResponse.builder()
                .success(true)
                .message("Your number is "+id)
                .build());

    }
}
