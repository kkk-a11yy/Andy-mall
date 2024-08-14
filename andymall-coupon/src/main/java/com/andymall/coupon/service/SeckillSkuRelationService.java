package com.andymall.coupon.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.coupon.entity.SeckillSkuRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:36:40
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

