package com.hello.springcloud.alibaba.controller;

import com.hello.springcloud.alibaba.domain.CommonResult;
import com.hello.springcloud.alibaba.domain.Order;
import com.hello.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 95
 * @Date: 2020/4/22
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {

        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
