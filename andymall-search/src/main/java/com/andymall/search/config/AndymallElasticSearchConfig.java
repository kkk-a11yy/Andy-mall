package com.andymall.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.导入依赖
 * 2.编写配置
 *      给容器注入一个RestHighLevelClient
 */
@Configuration
public class AndymallElasticSearchConfig {

    public static final RequestOptions COMMON_OPTIONS;
    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        // builder.addHeader("Authorization", "Bearer " + TOKEN);
        // builder.setHttpAsyncResponseConsumerFactory(
        //         new HttpAsyncResponseConsumerFactory
        //                 .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024 * 1024));
        COMMON_OPTIONS = builder.build();
    }
    @Bean
    public RestHighLevelClient restHighLevelClient() {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.31.104", 9200, "http")));
        return client;
    }


//    public static final RequestOptions COMMON_OPTIONS;
//    static {
//        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
////        builder.addHeader("Authorization", "Bearer " + TOKEN);
////        builder.setHttpAsyncResponseConsumerFactory(
////                new HttpAsyncResponseConsumerFactory
////                        .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024 * 1024));
//        COMMON_OPTIONS = builder.build();
//    }

}
