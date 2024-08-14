package com.andymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-08-19 23:08:18
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

