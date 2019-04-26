package com.ljq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
//把zuul作为服务提供者到eureka注册
public class GatewayApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(GatewayApplication.class);
	GatewayApplication(){
		LOGGER.info("app init");
	}
	public static void main(String[] args) {
		LOGGER.info("app start");
		SpringApplication.run(GatewayApplication.class, args);
	}

}
