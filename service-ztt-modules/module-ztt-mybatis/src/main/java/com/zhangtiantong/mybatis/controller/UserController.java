package com.zhangtiantong.mybatis.controller;

import com.zhangtiantong.mybatis.entity.HyAccountEntity;
import com.zhangtiantong.mybatis.entity.HyAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

/**
 * Created by zhangtiantong on 2018/2/10/010.
 */
@RestController
public class UserController {

    @Autowired
    private HyAccountMapper hyAccountMapper;

    @RequestMapping("/selectUser")
    public HyAccountEntity getUserInfosByUserId(BigInteger userId) {

        return this.hyAccountMapper.getUserByUserId(userId);
    }
}