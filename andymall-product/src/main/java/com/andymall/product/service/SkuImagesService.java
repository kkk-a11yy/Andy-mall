package com.andymall.product.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.product.entity.SkuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * sku图片
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-08-19 23:08:18
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuImagesEntity> getImagesBySkuId(Long skuId);
}

