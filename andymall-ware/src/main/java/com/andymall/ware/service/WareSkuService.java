package com.andymall.ware.service;

import com.andymall.common.to.SkuHasStockVo;
import com.andymall.common.utils.PageUtils;
import com.andymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:59:40
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);


    List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);
//    /**
//     * 锁定库存
//     * @param vo
//     * @return
//     */
//    boolean orderLockStock(WareSkuLockVo vo);
//
//
//    /**
//     * 解锁库存
//     * @param to
//     */
//    void unlockStock(StockLockedTo to);
//
//    /**
//     * 解锁订单
//     * @param orderTo
//     */
//    void unlockStock(OrderTo orderTo);
}



