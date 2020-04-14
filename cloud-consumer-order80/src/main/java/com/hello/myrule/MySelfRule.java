package com.hello.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @Author: 95
 * @Date: 2020/4/11
 */

// 自定义配置类不能放在@ComponentScan所扫描的当前包以及子包下。
// @ComponentScan存在于@SpringBootApplication中
public class MySelfRule {

    @Bean
    public IRule myRule(){

        return new RandomRule();//定义为随机
    }
}
