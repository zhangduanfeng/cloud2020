package com.gem.springcloud.controller;

import com.gem.springcloud.entities.CommonResult;
import com.gem.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-04-12 15:22
 **/
@RestController
@Slf4j
public class OrderZKController {
    public static final String PAYMENT_URL = "http://cloud-payment-service";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String forObject = restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
        return forObject;
    }
}
