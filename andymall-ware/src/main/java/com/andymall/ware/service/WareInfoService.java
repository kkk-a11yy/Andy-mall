package com.andymall.ware.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:59:40
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

