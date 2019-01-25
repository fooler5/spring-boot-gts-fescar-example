package com.sinochem.finance.hsy.service;

import com.sinochem.finance.hsy.dto.BusinessDTO;
import com.sinochem.finance.hsy.response.ObjectResponse;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019/1/14 17:17
 */
public interface BusinessService {

    ObjectResponse handleBusiness(BusinessDTO businessDTO);
}
