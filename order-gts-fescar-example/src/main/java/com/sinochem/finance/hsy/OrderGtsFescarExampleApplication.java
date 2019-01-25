package com.sinochem.finance.hsy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.sinochem.finance.hsy")
@EnableDiscoveryClient
@MapperScan({"com.sinochem.finance.hsy.mapper"})
@EnableFeignClients(basePackages = "com.sinochem.finance.hsy")
@EnableDubbo(scanBasePackages = "com.sinochem.finance.hsy")
public class OrderGtsFescarExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderGtsFescarExampleApplication.class, args);
    }

}

