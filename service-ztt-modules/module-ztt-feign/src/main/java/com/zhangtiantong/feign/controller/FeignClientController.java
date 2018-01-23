package com.zhangtiantong.feign.controller;

import com.zhangtiantong.feign.service.FeignClientSayHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/9/8.
 */

@RestController
public class FeignClientController {

    @Autowired
    FeignClientSayHi feignClientSayHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(String name) {
        return feignClientSayHi.sayHiFromClientOne(name);
    }
}
