package com.andymall.coupon.dao;

import com.andymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-26 17:56:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
