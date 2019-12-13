package com.zking.asset.system.mapper;

import com.zking.asset.system.model.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}