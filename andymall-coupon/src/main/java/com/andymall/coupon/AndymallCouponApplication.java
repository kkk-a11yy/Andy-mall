package com.andymall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.andymall.coupon.dao")
@EnableDiscoveryClient
public class AndymallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndymallCouponApplication.class, args);
    }

}
