package com.yzwine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerRunApplication.class, args);
    }
}