package com.ruri.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruri.common.utils.PageUtils;
import com.ruri.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-21 21:59:09
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

