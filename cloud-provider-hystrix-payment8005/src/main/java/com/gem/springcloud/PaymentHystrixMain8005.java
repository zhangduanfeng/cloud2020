package com.gem.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:gusubaiyi
 * @vx:zdf824780260
 * @blog:www.gusubaiyi.com
 * @date:2020/10/5 6:37 下午
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8005.class,args);
    }
}
