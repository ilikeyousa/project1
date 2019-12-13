package com.zking.asset.book.mapper;

import com.zking.asset.book.model.SysUserRole;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}