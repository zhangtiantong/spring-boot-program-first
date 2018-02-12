package com.zhangtiantong.redis.controller;

import com.alibaba.fastjson.JSON;
import com.zhangtiantong.redis.entity.User;
import com.zhangtiantong.redis.service.RedisService;
import com.zhangtiantong.redis.service.RedisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dell on 2017/10/23.
 */

@RestController
public class RedisController {

    @Autowired
    private RedisTestService redisTestService;

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/setObjectToRedis", method = {RequestMethod.GET, RequestMethod.POST})
    public void setObjectToRedis(@RequestBody User user) {
        redisService.setObj(user.getId(), user);
    }

    @RequestMapping("/setStrToRedis")
    public void setStrToRedis(String key, String value) {

        redisService.setStr(key, value);
    }

    @RequestMapping(value = "/getObjectToRedis", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getObjectToRedis(@RequestBody User user) {

        Object user1 = redisService.getObj(user.getId());
        return JSON.toJSONString(user1);
    }

    @RequestMapping(value = "/getStrToRedis", method = {RequestMethod.GET})
    @ResponseBody
    public String getStrToRedis(String key) {
        return redisService.getStr(key);
    }

    @RequestMapping("/redisTest")
    public void test() {
        for (int i = 0; i < 10; i++) {
            redisTestService.set("" + i, i);
        }

    }
}
