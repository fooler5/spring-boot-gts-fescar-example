package com.sinochem.finance.hsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.sinochem.finance.hsy")
@EnableDiscoveryClient
public class DubboGtsFescarExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboGtsFescarExampleApplication.class, args);
    }

}

