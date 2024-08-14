package com.andymall.product.service;

import com.andymall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-08-19 23:08:18
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);


    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> list);


    /**
     * 找到catalogId的完整路径
     * 【父/子/孙】
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);


}

