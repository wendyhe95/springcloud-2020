package com.hello.springcloud.alibaba.service;

import com.hello.springcloud.entities.CommonResult;
import com.hello.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: 95
 * @Date: 2020/4/20
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {

        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));

    }
}
