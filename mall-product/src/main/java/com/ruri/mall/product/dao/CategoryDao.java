package com.ruri.mall.product.dao;

import com.ruri.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-20 10:09:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
