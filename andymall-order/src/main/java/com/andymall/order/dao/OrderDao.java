package com.andymall.order.dao;

import com.andymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-29 21:15:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
