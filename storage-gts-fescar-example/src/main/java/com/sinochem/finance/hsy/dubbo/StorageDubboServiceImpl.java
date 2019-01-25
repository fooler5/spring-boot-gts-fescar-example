package com.sinochem.finance.hsy.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fescar.core.context.RootContext;
import com.sinochem.finance.hsy.dto.CommodityDTO;
import com.sinochem.finance.hsy.feign.StorageService;
import com.sinochem.finance.hsy.response.ObjectResponse;
import com.sinochem.finance.hsy.service.ITStorageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019/1/23 16:13
 */
@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
        timeout = 3000)
public class StorageDubboServiceImpl implements StorageDubboService{

    @Autowired
    private ITStorageService storageService;

    @Override
    public ObjectResponse decreaseStorage(CommodityDTO commodityDTO) {
        System.out.println("全局事务id ：" + RootContext.getXID());
        return storageService.decreaseStorage(commodityDTO);
    }
}
