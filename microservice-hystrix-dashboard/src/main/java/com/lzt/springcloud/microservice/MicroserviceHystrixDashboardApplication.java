package com.lzt.springcloud.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringBootApplication
public class MicroserviceHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceHystrixDashboardApplication.class, args);
    }

}
