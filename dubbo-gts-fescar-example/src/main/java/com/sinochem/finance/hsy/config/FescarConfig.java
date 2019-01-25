package com.sinochem.finance.hsy.config;

import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: heshouyou
 * @Description  Fescar全局事务配置
 * @Date Created in 2019/1/24 10:28
 */
@Configuration
public class FescarConfig {

    /**
     * 配置全局事务扫描
     * @Param:
     * @Return:
     */
    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("dubbo-gts-fescar-example", "my_test_tx_group");
    }
}
