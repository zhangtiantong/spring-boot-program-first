package com.zhangtiantong.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dell on 2017/9/8.
 */

@FeignClient(value = "SERVICE-EUREKACLIENT1",fallback = FeignClientSayHiFallBack.class)
public interface FeignClientSayHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
