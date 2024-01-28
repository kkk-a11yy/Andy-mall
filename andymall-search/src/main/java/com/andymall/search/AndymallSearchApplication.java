package com.andymall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
//@EnableRedisHttpSession
public class AndymallSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndymallSearchApplication.class, args);
    }

}
