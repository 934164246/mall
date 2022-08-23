package com.ruri.mall.coupon.dao;

import com.ruri.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 优惠券信息
 * 
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-20 17:35:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
