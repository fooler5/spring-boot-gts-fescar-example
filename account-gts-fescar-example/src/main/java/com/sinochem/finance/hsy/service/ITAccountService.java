package com.sinochem.finance.hsy.service;

import com.sinochem.finance.hsy.entity.TAccount;
import com.baomidou.mybatisplus.service.IService;
import com.sinochem.finance.hsy.dto.AccountDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
public interface ITAccountService extends IService<TAccount> {

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
