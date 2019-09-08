package com.lzt.springcloud.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEureka1Application.class, args);
    }

}
