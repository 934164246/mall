package com.ruri.mall.order.dao;

import com.ruri.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-21 21:51:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
