package com.zhangtiantong.redis.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ZHANGTIANTRONG on 2018/2/12/012.
 */
@Service
public class RedisService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<Object, Object> valOpsStr;

    @Autowired
    RedisTemplate redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<Object, Object> valOpsObj;

    public String getStr(String key) {
        return (String) valOpsStr.get(key);
    }

    public void setStr(String key, String val) {
        if (!StringUtils.isEmpty(key)) {
            valOpsStr.set(key, val);
        }
    }

    public void del(String key) {
        if (!StringUtils.isEmpty(key)) {
            stringRedisTemplate.delete(key);
        }
    }

    /**
     * 根据指定o获取Object
     *
     * @param o
     * @return
     */
    public Object getObj(Object o) {
        return valOpsObj.get(o);
    }

    /**
     * 设置obj缓存
     *
     * @param o1
     * @param o2
     */
    public void setObj(Object o1, Object o2) {
        if (null != o1) {
            valOpsObj.set(o1, o2);
        }
    }

    /**
     * 删除Obj缓存
     *
     * @param o
     */
    public void delObj(Object o) {
        if (null != o) {
            redisTemplate.delete(o);
        }
    }


}