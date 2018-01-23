package com.zhangtiantong.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dell on 2017/9/8.
 */
@Configuration
@ComponentScan(value = "com.zhangtiantong.ribbon")
public class ModuleZttRibbonConfiguration {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
