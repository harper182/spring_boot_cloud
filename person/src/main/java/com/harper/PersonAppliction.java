package com.harper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersonAppliction {
    public static void main(String[] args) {
        SpringApplication.run(PersonAppliction.class);
    }
}
