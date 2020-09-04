package com.lhy.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/client")
@RestController
public class ClientTestController {
    @Value("env")
    String env;

    @GetMapping("getEnv")
    public String getEnv(){
        return env;
    }
}
