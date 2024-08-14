package com.andymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.andymall.common.utils.PageUtils;
import com.andymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-26 20:02:07
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

