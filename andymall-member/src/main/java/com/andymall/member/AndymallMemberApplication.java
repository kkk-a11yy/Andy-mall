package com.andymall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.andymall.member.feign")
@SpringBootApplication
@MapperScan("com.andymall.member.dao")
@EnableDiscoveryClient
public class AndymallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndymallMemberApplication.class, args);
    }

}
