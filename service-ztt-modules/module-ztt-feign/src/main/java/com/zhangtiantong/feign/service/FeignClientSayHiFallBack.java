package com.zhangtiantong.feign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dell on 2017/9/12.
 */

@Component
public class FeignClientSayHiFallBack implements FeignClientSayHi {

    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "hi I am from feignClient error " + name + "";
    }
}
