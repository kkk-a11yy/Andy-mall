package com.andymall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class AndymallCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        //1.配置跨域
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        //原来是addAllowedOrigin("*")，renren-fast出错403
        corsConfiguration.addAllowedOrigin("http://localhost:8001");
        corsConfiguration.setAllowCredentials(true);


        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);


    }
}
