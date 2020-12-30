package com.yzwine.controller;

import com.yzwine.TestFeign;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestController {
    @Autowired
    TestFeign testFeign;// 注入 Feign接口
    @RequestMapping(value = "/test")
    public String test(){
        return testFeign.testByFeign();
    }

    // 测试带普通参数
    @RequestMapping(value = "/testByParam")
    public String testByParam(@RequestParam("from") String from){
        return testFeign.testByParam(from);
    }


    // 测试带多个普通参数Map
    @RequestMapping(value = "/testByMap")
    public String testByMap(Map<String,Object> map){
        return testFeign.testByMap(map);
    }


    // 测试参数是对象的情况  @RequestBody  User user
    @RequestMapping(value = "/testByRequestBody",method = RequestMethod.POST)
    public String testByRequestBody(@RequestBody User user){
        return testFeign.testByRequestBody(user);
    }

}