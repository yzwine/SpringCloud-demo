package com.yzwine.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor getRequestInterceptor(){
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                /** 设置请求头信息 **/
                // requestTemplate.header("Content-Type", "application/json");
                // 可以做日志记录
                System.out.println("自定义拦截器");
            }
        };
    }

}
