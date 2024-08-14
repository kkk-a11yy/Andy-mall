package com.andymall.product.service;

import com.andymall.product.vo.AttrGroupRelationVo;
import com.andymall.product.vo.AttrRespVo;
import com.andymall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-08-19 23:08:18
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);


    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);


    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

    /**
     * 在指定的属性集合中，筛选出检索属性的attrIds
     * @param attrIds
     * @return
     */
    List<Long> selectSearchAttrs(List<Long> attrIds);
}

