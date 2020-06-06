package com.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka 服务中心
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka1000Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka1000Application.class, args);
    }
}
