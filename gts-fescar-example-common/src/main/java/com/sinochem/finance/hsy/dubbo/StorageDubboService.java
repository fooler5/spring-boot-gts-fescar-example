package com.sinochem.finance.hsy.dubbo;

import com.sinochem.finance.hsy.dto.CommodityDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;

/**
 * @Author: heshouyou
 * @Description  仓库服务
 * @Date Created in 2019/1/13 16:22
 */
public interface StorageDubboService {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
