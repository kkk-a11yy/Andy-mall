package com.andymall.product.service;


import com.andymall.common.utils.PageUtils;
import com.andymall.product.entity.SpuInfoDescEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2019-10-01 21:08:49
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity descEntity);


}

