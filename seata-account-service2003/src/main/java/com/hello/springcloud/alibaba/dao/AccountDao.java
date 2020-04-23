package com.hello.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author: 95
 * @Date: 2020/4/22
 */

@Mapper
public interface AccountDao {

    // 扣减账户余额
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
