package com.andymall.member.dao;

import com.andymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-26 20:02:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
