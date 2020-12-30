package com.yzwine.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;
    @Value("${kd.app.name}")
    String appName;

    @RequestMapping("/test")
    public String test() {
        int a=1/0;// 除数不能为0
        return appName+"上线测试:"+name+":"+port;
    }

    // 测试带普通参数
    @RequestMapping("/testByParam")
    public String testByParam(String from) {
        return appName+"上线测试:"+name+":"+port+"来自:"+from;
    }

    // 测试带多个普通参数Map
    @RequestMapping("/testByMap")
    public String testByParam(@RequestParam Map<String,Object> map) {
        return appName+"上线测试:"+name+":"+port+"用户:"+map.get("name");
    }

    // 测试参数是对象的情况
    @RequestMapping("/testByRequestBody")
    public String testByRequestBody(@RequestBody User user) {
        return appName+"上线测试:"+name+":"+port+"用户:"+user.getName();
    }
}
