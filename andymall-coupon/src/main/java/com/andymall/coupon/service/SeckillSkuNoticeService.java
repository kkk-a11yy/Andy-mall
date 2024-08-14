package com.andymall.coupon.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.coupon.entity.SeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:36:39
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

