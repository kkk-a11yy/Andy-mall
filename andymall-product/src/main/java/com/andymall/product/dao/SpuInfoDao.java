package com.andymall.product.dao;


import com.andymall.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 * 
 * @author ksia
 * @email ksiafor@gmail.com
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {


    void updateSpuStatus(@Param("spuId") Long spuId, @Param("code") int code);
}
