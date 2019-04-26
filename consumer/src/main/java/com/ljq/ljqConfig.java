package com.ljq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ljqConfig {
    private static final Logger logger = LoggerFactory.getLogger(ljqConfig.class);
    ljqConfig(){
        logger.info("config init");
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        logger.info("restTemplate function");
        return new RestTemplate();
    }
}
