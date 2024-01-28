package com.andymall.product.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.product.entity.SpuInfoEntity;
import com.andymall.product.vo.SpuSaveVo;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.Map;

/**
 * spu信息
 *
 * @auther ksiafor
 * @date 2019-10-01 21:08:49
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);


    PageUtils queryPageByCondition(Map<String, Object> params);


}

