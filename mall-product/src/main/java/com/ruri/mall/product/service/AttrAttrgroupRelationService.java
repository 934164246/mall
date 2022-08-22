package com.ruri.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruri.common.utils.PageUtils;
import com.ruri.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-20 10:09:25
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

