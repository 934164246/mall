package com.ruri.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruri.common.utils.PageUtils;
import com.ruri.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-20 17:35:41
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

