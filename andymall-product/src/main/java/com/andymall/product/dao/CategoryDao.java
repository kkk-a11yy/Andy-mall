package com.andymall.product.dao;

import com.andymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-08-19 23:08:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
