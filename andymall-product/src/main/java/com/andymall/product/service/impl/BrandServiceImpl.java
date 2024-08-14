package com.andymall.product.service.impl;

import com.andymall.product.service.CategoryBrandRelationService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.andymall.common.utils.PageUtils;
import com.andymall.common.utils.Query;

import com.andymall.product.dao.BrandDao;
import com.andymall.product.entity.BrandEntity;
import com.andymall.product.service.BrandService;
import org.springframework.transaction.annotation.Transactional;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //1.获取key
        String key = (String) params.get("key");
        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(key)) {
            wrapper.eq("brand_id",key).or().like("name",key);
        }
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                wrapper
        );

        return new PageUtils(page);
    }

    @Transactional
    @Override
    public void updateDetial(BrandEntity brand) {
        //保证冗余字段数据一致
        this.updateById(brand);
        if (!StringUtils.isEmpty(brand.getName())) {
            //同步更新其他关联表的数据
            categoryBrandRelationService.updateBrand(brand.getBrandId(),brand.getName());

            //TODO：更新其他关联
        }
    }

}