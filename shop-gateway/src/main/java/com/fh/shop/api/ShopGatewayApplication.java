package com.fh.shop.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wzq
 * @description
 * @date 2021/6/7 20:36
 */
@SpringBootApplication
@EnableZuulProxy
public class ShopGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopGatewayApplication.class,args);
    }
}
