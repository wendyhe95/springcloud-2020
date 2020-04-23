package com.hello.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 95
 * @Date: 2020/4/18
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401{

    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class, args);
    }
}
