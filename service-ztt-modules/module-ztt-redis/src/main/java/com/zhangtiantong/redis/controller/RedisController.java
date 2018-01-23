package com.zhangtiantong.redis.controller;

import com.zhangtiantong.redis.service.RedisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dell on 2017/10/23.
 */

@Controller
public class RedisController {

    @Autowired
    private RedisTestService redisTestService;

    @RequestMapping("/redisTest")
    public void test() {
        for (int i = 0; i < 10; i++) {
            redisTestService.set("" + i, i);
        }

    }
}
