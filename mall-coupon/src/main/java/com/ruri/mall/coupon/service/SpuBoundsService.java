package com.ruri.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruri.common.utils.PageUtils;
import com.ruri.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-20 17:35:41
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

