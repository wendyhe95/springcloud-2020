package com.hello.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hello.springcloud.entities.CommonResult;

/**
 * @Author: 95
 * @Date: 2020/4/18
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {

        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {

        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
