package com.ruri.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruri.common.utils.PageUtils;
import com.ruri.common.utils.Query;

import com.ruri.mall.product.dao.CategoryDao;
import com.ruri.mall.product.entity.CategoryEntity;
import com.ruri.mall.product.service.CategoryService;


/**
 * 分类服务实现类
 *
 * @author GokouRuri
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> list = baseMapper.selectList(null);

        //按照父级id分类
        Map<Long, List<CategoryEntity>> collect = list.stream()
                .sorted(Comparator.comparingInt(item -> Optional.ofNullable(item.getSort()).orElse(0)))
                .collect(Collectors.groupingBy(CategoryEntity::getParentCid));

        //匹配孩子节点并且挑选出父节点
        return list.stream()
                .peek(item -> item.setChild(collect.get(item.getCatId())))
                .filter(item -> item.getCatLevel().equals(1))
                .collect(Collectors.toList());
    }
}