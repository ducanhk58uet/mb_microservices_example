package com.itlead.trade.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @GetMapping
    public Map<String, String> home() {
        Map<String, String> result = new HashMap<>();
        result.put("Say", "Hello world!");
        return result;
    }
}
