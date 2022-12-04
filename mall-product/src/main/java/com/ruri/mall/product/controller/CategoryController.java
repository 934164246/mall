package com.ruri.mall.product.controller;

import java.util.Arrays;
import java.util.List;

import com.ruri.mall.product.mapper.CategoryEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ruri.mall.product.entity.CategoryEntity;
import com.ruri.mall.product.service.CategoryService;
import com.ruri.common.utils.R;



/**
 * 商品三级分类
 *
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-20 16:59:44
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list/tree")
    //@RequiresPermissions("product:category:list")
    public R listWithTree(){
        //分级菜单树形结构查询结果
        List<CategoryEntity> categoryEntities = categoryService.listWithTree();

        return R.ok().put("tree", categoryEntities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", CategoryEntityMapper.INTSANCE.toDto(category));
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category) {
        category.setShowStatus(1);
        category.setSort(0);
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){
        boolean flag = categoryService.removeBatchByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
