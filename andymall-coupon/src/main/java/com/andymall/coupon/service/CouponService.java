package com.andymall.coupon.service;

import com.andymall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-26 17:56:20
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

