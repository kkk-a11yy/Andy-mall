package com.andymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-29 22:04:26
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

