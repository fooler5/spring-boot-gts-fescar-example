package com.sinochem.finance.hsy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.sinochem.finance.hsy")
@EnableDiscoveryClient
@MapperScan({"com.sinochem.finance.hsy.mapper"})
@EnableDubbo(scanBasePackages = "com.sinochem.finance.hsy")
public class AccountGtsFescarExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountGtsFescarExampleApplication.class, args);
    }

}

