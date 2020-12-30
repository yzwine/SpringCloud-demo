package com.yzwine.model;

import com.yzwine.TestFeign;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TestFeignFallback implements TestFeign {
    @Override
    public String testByFeign() {
        return "error";
    }

    @Override
    public String testByParam(String from) {
        return "error";
    }

    @Override
    public String testByMap(Map<String, Object> map) {
        return "error";
    }

    @Override
    public String testByRequestBody(User user) {
        return "error";
    }


}