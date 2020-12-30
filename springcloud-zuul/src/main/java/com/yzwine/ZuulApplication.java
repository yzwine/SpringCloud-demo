package com.yzwine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy// @EnableZuulProxy 自动加载过滤器bean
@EnableDiscoveryClient
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
    // AccessToken访问权限拦截
    @Bean
    public AccessTokenFilter accessTokenFilter() {
        return new AccessTokenFilter();
    }
}
