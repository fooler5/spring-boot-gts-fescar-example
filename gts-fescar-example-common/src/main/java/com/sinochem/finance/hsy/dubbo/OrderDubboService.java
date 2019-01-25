package com.sinochem.finance.hsy.dubbo;

import com.sinochem.finance.hsy.dto.OrderDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;

/**
 * @Author: heshouyou
 * @Description  订单服务接口
 * @Date Created in 2019/1/13 16:28
 */
public interface OrderDubboService {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
