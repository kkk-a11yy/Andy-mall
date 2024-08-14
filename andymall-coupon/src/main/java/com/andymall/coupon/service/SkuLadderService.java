package com.andymall.coupon.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:36:40
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

