package com.zking.asset.system.mapper;

import com.zking.asset.system.model.RoleModule;

public interface RoleModuleMapper {
    int insert(RoleModule record);

    int insertSelective(RoleModule record);
}