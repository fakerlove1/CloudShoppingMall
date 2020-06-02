package com.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class consumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(consumer80Application.class, args);
    }
}
