package com.sinochem.finance.hsy.feign;

import com.sinochem.finance.hsy.dto.AccountDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: heshouyou
 * @Description  账户服务接口
 * @Date Created in 2019/1/13 16:37
 */
@FeignClient("account-gts-fescar-example")
public interface AccountService {

    /**
     * 从账户扣钱
     */
    @PostMapping("/account/dec_account")
    ObjectResponse decreaseAccount(@RequestBody AccountDTO accountDTO);
}
