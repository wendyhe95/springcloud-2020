package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

/**
 * @Author: 95
 * @Date: 2020/4/11
 */

// Consul是一套开源的分布式服务发现和配置管理系统，由HashiCorp公司用go语言开发
// 提供了微服务系统中的服务治理、配置中心、控制总线等功能。
// 功能中的每一个都可以根据需要单独使用，也可以一起使用以构建全方位的服务网格
// 总之Consul提供了一种完整的服务网格解决方案
// http://springcloud.cc/spring-cloud-consul.html
// 下载 http://learn.hashicorp.com/consul/getting-started/install.html
// 使用开发者模式启动：consul --version  查看版本号  consul sgent-dev 启动         访问首页：http://localhost:8500
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class,args);
    }
}
