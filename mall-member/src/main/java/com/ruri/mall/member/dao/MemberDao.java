package com.ruri.mall.member.dao;

import com.ruri.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author GokouRuri
 * @email rurigokou934164246@gmail.com
 * @date 2022-08-21 21:20:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
