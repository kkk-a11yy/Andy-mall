package com.andymall.ware.service;

import com.andymall.common.utils.PageUtils;
import com.andymall.ware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2024-1-15 09:59:40
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

