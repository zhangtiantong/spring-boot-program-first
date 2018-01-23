package com.zhangtiantong.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dell on 2017/9/8.
 */
@Service
public class SayHiService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String name) {
        return restTemplate.getForObject("http://SERVICE-EUREKACLIENT1/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi, I am " + name + " sorry Error!";
    }
}
