package com.hmb.zuulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * 客户端
 * 网关
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulClientApplication.class, args);
    }
}
