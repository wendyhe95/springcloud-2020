package com.hello.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 95
 * @Date: 2020/4/15
 */

/**
 *  github上修改后  在终端输入:curl -X POST "http://localhost:3355/actuator/refresh"进行刷新
 *  刷新3355的值后  在发送localhost:3355/configInfo 可以获得最新的值
 *  当有多个客户端的时候，若修改github配置，每个客户端都需要进行终端发送，工程量较大
 *  添加消息总件支持后，进行广播型通知。一次发送，各个客户端都生效
 *  运维工程师只需要发给服务端发送 curl -X POST "http://localhost:3344/actuator/bus-refresh"
 *
 *  定点通知：广播通知下指定具体某一个实例生效
 *  http://localhost:配置中心端口号/actuator/bus-refresh/{destination}
 *  bus/refresh请求发送到config sever通过destination参数指定要更新配置的实例或服务
 *  只通知3355。eg:  curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
 */
@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${config.info}")
    private String configInfo;

    // localhost:3355/configInfo
    @GetMapping("/configInfo")
    public String getConfigInfo() {

        return configInfo;
    }

}
