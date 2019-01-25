package com.sinochem.finance.hsy.feign;

import com.sinochem.finance.hsy.dto.CommodityDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: heshouyou
 * @Description  仓库服务
 * @Date Created in 2019/1/13 16:22
 */
@FeignClient(value = "storage-gts-fescar-example")
public interface StorageService {

    /**
     * 扣减库存
     */
    @PostMapping("/storage/dec_storage")
    ObjectResponse decreaseStorage(@RequestBody CommodityDTO commodityDTO);
}
