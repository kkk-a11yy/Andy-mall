package com.andymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.andymall.product.feign")
@SpringBootApplication
@MapperScan("com.andymall.product.dao")
@EnableDiscoveryClient
public class AndymallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndymallProductApplication.class, args);
	}

}
