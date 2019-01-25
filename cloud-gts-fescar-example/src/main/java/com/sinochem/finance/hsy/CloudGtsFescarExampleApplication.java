package com.sinochem.finance.hsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.sinochem.finance.hsy")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sinochem.finance.hsy.feign")
public class CloudGtsFescarExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGtsFescarExampleApplication.class, args);
    }

}

