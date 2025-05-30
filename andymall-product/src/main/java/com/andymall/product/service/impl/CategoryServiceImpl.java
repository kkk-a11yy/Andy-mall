package com.andymall.product.service.impl;

import com.andymall.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.andymall.common.utils.PageUtils;
import com.andymall.common.utils.Query;
import com.andymall.product.dao.CategoryDao;
import com.andymall.product.entity.CategoryEntity;
import com.andymall.product.service.CategoryService;
import org.springframework.transaction.annotation.Transactional;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //2.组装成父子的树形结构

        //2.1 找到所有一级分类
        entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((menu)-> {
                    menu.setChildren(getChildrens(menu, entities));
                    return menu;
                }).sorted((menu1,menu2)->{
                    return (menu1.getSort() ==null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());



        return entities;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1.检查当前删除的菜单，是否被别的地方调用
        //逻辑删除
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);
        Collections.reverse(parentPath);
        return (Long[]) parentPath.toArray(new Long[parentPath.size()]);
    }

    /**
     * 级联更新所有数据
     * @param category
     */
    @Transactional
    @Override
    public void updateCascade(CategoryEntity category) {
        this.updateById(category);
        categoryBrandRelationService.updateCategory(category.getCatId(),category.getName());
    }



    private List<Long> findParentPath(Long catelogId, List<Long> paths){
        //1.收集当前节点id
        paths.add(catelogId);
        CategoryEntity byId = this.getById(catelogId);
        if (byId.getParentCid()!=0) {
            findParentPath(byId.getParentCid(), paths);
        }
        return paths;
    }

    //递归查出所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            //1.找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
            //2.菜单的排序
        }).sorted((menu1,menu2)->{
            return (menu1.getSort() ==null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }



}