package com.lzt.springcloud.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lzt.springcloud.microservice.service")
@SpringBootApplication
public class MicroserviceConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerFeignHystrixApplication.class, args);
    }

}
