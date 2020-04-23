package com.hello.springcloud.alibaba.service;


/**
 * @Author: 95
 * @Date: 2020/4/22
 */

public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
