package com.andymall.coupon.service;

import com.andymall.common.to.SkuReductionTo;
import com.andymall.common.utils.PageUtils;
import com.andymall.coupon.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:36:40
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);


}

