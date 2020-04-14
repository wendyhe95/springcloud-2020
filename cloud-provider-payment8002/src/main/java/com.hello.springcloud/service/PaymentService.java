package com.hello.springcloud.service;

import com.hello.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther 95
 * @create 2020/04/08
 */
public interface PaymentService{

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
    
}
