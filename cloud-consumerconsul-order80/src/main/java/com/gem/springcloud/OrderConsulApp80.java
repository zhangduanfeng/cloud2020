package com.gem.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-04-12 20:39
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulApp80.class,args);
    }
}
