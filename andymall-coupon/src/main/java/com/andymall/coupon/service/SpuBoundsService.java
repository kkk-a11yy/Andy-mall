package com.andymall.coupon.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.coupon.entity.SpuBoundsEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:36:40
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

