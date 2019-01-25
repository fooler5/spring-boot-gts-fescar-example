package com.sinochem.finance.hsy.service;

import com.sinochem.finance.hsy.entity.TStorage;
import com.baomidou.mybatisplus.service.IService;
import com.sinochem.finance.hsy.dto.CommodityDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;

/**
 * 仓库服务
 * @author heshouyou
 * @since 2019-01-13
 */
public interface ITStorageService extends IService<TStorage> {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
