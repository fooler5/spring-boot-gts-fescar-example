package com.sinochem.finance.hsy.feign;

import com.sinochem.finance.hsy.dto.OrderDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: heshouyou
 * @Description  订单服务接口
 * @Date Created in 2019/1/13 16:28
 */
@FeignClient("order-gts-fescar-example")
public interface OrderService {

    /**
     * 创建订单
     */
    @PostMapping("/order/create_order")
    ObjectResponse<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO);
}
