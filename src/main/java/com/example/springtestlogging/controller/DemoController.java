package com.example.springtestlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/demo")
public class DemoController {

    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/test")
    public String test(){
        logger.debug("Time is : {}", LocalDateTime.now());
        return "Test is successful";
    }
}
