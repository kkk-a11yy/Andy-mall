package com.andymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-29 21:15:33
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

