package com.sinochem.finance.hsy.service;

import com.sinochem.finance.hsy.entity.TOrder;
import com.baomidou.mybatisplus.service.IService;
import com.sinochem.finance.hsy.dto.OrderDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;

/**
 * <p>
 *  创建订单
 * </p>
 *
 * @author heshouyou
 * @since 2019-01-13
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
