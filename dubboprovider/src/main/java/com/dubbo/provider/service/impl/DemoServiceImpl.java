package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.DemoService;


@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {


        return "你好"+ name;
    }
}
