package com.harper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryAppliction {
    public static void main(String[] args) {
        System.out.println("discovery start...");
        SpringApplication.run(DiscoveryAppliction.class);
    }
}
