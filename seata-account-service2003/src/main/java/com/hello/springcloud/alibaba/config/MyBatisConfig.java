package com.hello.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 95
 * @Date: 2020/4/22
 */
@Configuration
@MapperScan("com.hello.springcloud.alibaba.dao")
public class MyBatisConfig {
}
