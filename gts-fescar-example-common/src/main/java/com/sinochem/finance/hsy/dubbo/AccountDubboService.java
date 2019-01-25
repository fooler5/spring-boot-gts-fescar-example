package com.sinochem.finance.hsy.dubbo;

import com.sinochem.finance.hsy.dto.AccountDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;

/**
 * @Author: heshouyou
 * @Description  账户服务接口
 * @Date Created in 2019/1/13 16:37
 */
public interface AccountDubboService {

    /**
     * 从账户扣钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
