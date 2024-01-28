package com.andymall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.andymall.ware.dao")
@EnableDiscoveryClient
public class AndymallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndymallWareApplication.class, args);
	}

}
