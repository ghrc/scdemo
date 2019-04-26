package com.ljq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    //value注解的作用是获得配置文件上的对应的key
    @Value("${Parameter}")
    private String Parameter;

    @Value("${server.port}")
    private String port;
    @Autowired
    private Environment environment;
    @GetMapping("/get_name")
    public String name(){
        return "Parameter:"+Parameter;
    }
    @GetMapping("/get_port")
    public String port(){
        return "Port:"+port;
    }
    @GetMapping("/get_name_env")
    public String name_env(){
        return environment.getProperty("Parameter","undefine");
    }
}
