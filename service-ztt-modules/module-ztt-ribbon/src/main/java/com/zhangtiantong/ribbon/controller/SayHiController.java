package com.zhangtiantong.ribbon.controller;

import com.zhangtiantong.ribbon.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/9/8.
 */
@RestController
public class SayHiController {

    @Autowired
    SayHiService sayHiService;

    @RequestMapping(value = "/hi")
    public String sayHi(String name){
        return this.sayHiService.sayHi(name);
    }

}
