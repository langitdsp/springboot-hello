package com.asterx.medirecords.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeRest {

    @Autowired
    private Environment env;

    @RequestMapping("/home")
    public String home(){
        String message = env.getProperty("message");
        return "Hello " + message;
    }
}
