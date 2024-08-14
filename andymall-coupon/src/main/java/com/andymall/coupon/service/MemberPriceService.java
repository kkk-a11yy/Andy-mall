package com.andymall.coupon.service;

import com.andymall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-26 17:56:20
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

