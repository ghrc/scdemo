package com.ljq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ljqController {
    private static final Logger logger = LoggerFactory.getLogger(ljqController.class);
    ljqController(){
        logger.info("controller init");
    }
    @Autowired
    private RestTemplate restTemplate;

    //这里不写eureka的注册中心，而是写服务提供者的应用名
    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest request){
        logger.info("hello function");
//        RequestContext ctx = RequestContext.getgetCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
        logger.info(request.getPathInfo());
        logger.info("--->>> consumer contorller {},{}", request.getMethod(), request.getRequestURL().toString());

        String token = request.getParameter("name");// 获取请求的参数
        logger.info(token);

        return restTemplate.getForEntity("http://eureka-client-service-provider/", String.class).getBody();
    }
}
