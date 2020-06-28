package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        logger.info(name + " info!");
        logger.debug(name + " debug!");
        logger.error(name + " error!");
        logger.trace(name + " trace!");
        logger.warn(name + " warn!");
        return "hello " + name + "!";
    }

}
