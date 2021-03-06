package com.gem.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-03-16 14:49
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class PaymentApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp8001.class,args);
    }
}
