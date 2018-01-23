package com.zhangtiantong.eurekaClient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/9/8.
 */

@RestController
public class SayHiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String sayHi() {
        return "Hi, I am from port " + this.port + " to say fuck with you";
    }
}
