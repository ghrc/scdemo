package com.ljq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ljqController {
    private final Logger logger = LoggerFactory.getLogger(ljqController.class);
    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home(HttpServletRequest request){
        logger.info(request.getPathInfo());
        logger.info("--->>> consumer contorller {},{}", request.getMethod(), request.getRequestURL().toString());

        String token = request.getParameter("name");// 获取请求的参数
        logger.info(token);
        return "Hello world, port is:" + port;
    }
}
