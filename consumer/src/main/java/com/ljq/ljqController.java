package com.ljq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ljqController {
    @Autowired
    private RestTemplate restTemplate;

    //这里不写eureka的注册中心，而是写服务提供者的应用名
    @GetMapping(value = "/hello")
    public String hello(){
        return restTemplate.getForEntity("http://eureka-client-service-provider/", String.class).getBody();
    }
}
