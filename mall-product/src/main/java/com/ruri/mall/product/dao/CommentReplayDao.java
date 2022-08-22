package com.ruri.mall.product.dao;

import com.ruri.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-20 10:09:25
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
