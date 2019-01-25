package com.sinochem.finance.hsy.controller;


import com.sinochem.finance.hsy.dto.AccountDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;
import com.sinochem.finance.hsy.service.ITAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  账户扣钱
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
@RestController
@RequestMapping("/account")
@Slf4j
public class TAccountController {

    @Autowired
    private ITAccountService accountService;

    @PostMapping("/dec_account")
    ObjectResponse decreaseAccount(@RequestBody AccountDTO accountDTO){
        log.info("请求账户微服务：{}",accountDTO.toString());
        return accountService.decreaseAccount(accountDTO);
    }
}

