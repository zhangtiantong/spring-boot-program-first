package com.zhangtiantong.mybatis.entity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;


/**
 * Created by zhangtiantong on 2018/2/10/010.
 */
@Mapper
public interface HyAccountMapper {

    @Select("SELECT * FROM hy_account WHERE account_id = ${userId}")
    HyAccountEntity getUserByUserId(@Param("userId")BigInteger userId);
}