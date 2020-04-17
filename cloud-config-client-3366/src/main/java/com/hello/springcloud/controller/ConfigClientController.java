package com.hello.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: 95
 * @Date: 2020/4/16
 */
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String configInfo() {

        return "serverPort: "+serverPort+"\t\n\n configInfo: "+configInfo;
    }


}
