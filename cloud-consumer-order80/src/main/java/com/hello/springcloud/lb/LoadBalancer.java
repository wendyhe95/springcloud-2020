package com.hello.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: 95
 * @Date: 2020/4/11
 */

public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}

