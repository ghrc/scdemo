package com.ljq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class MyBaenConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBaenConfig.class);
    MyBaenConfig(){
        LOGGER.info("service init");
    }
    @Bean
    public MyFilter myFilter() {
        LOGGER.info("bean init");
        return new MyFilter();
    }
}
