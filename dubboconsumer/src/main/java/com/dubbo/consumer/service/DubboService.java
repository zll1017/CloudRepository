package com.dubbo.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;


@Component
public class DubboService {

    @Reference(version = "1.0.0")
    //private DemoService demoService;


    public String sayHi(String name){

        return null;
    }
}
