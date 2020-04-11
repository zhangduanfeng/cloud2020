package com.gem.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @作者:姑苏白衣
 * @微信号:zdf824780260
 * @个人博客:www.gusubaiyi.com
 * @时间:2020-04-05 18:35
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp7002.class,args);
    }
}
