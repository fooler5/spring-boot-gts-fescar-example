package com.sinochem.finance.hsy.service;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.sinochem.finance.hsy.enums.RspStatusEnum;
import com.sinochem.finance.hsy.exception.DefaultException;
import com.sinochem.finance.hsy.feign.OrderService;
import com.sinochem.finance.hsy.feign.StorageService;
import com.sinochem.finance.hsy.dto.BusinessDTO;
import com.sinochem.finance.hsy.dto.CommodityDTO;
import com.sinochem.finance.hsy.dto.OrderDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019/1/14 18:36
 */
@Service
public class BusinessServiceImpl implements BusinessService{

    @Autowired
    private StorageService storageService;

    @Autowired
    private OrderService orderService;

    /**
     * 处理业务逻辑
     * @Param:
     * @Return:
     */
    @Override
    @GlobalTransactional
    public ObjectResponse handleBusiness(BusinessDTO businessDTO) {
        ObjectResponse<Object> objectResponse = new ObjectResponse<>();
        //1、扣减库存
        CommodityDTO commodityDTO = new CommodityDTO();
        commodityDTO.setCommodityCode(businessDTO.getCommodityCode());
        commodityDTO.setCount(businessDTO.getCount());
        ObjectResponse storageResponse = storageService.decreaseStorage(commodityDTO);
        if (storageResponse.getStatus() != 200) {
            throw new DefaultException(RspStatusEnum.FAIL);
        }
        //2、创建订单
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUserId(businessDTO.getUserId());
        orderDTO.setCommodityCode(businessDTO.getCommodityCode());
        orderDTO.setOrderCount(businessDTO.getCount());
        orderDTO.setOrderAmount(businessDTO.getAmount());
        OrderDTO order = orderService.createOrder(orderDTO);
        System.out.println("cloud接口创建订单执行返回结果：" + order);

        objectResponse.setStatus(RspStatusEnum.SUCCESS.getCode());
        objectResponse.setMessage(RspStatusEnum.SUCCESS.getMessage());
        return objectResponse;
    }
}
