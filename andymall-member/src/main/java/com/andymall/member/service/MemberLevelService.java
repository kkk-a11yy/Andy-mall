package com.andymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-26 20:02:08
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

