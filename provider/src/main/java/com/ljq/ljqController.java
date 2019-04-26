package com.ljq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ljqController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home(){
        return "Hello world, port is:" + port;
    }
}
