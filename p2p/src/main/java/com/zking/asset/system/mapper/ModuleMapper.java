package com.zking.asset.system.mapper;

import com.zking.asset.system.model.Module;

public interface ModuleMapper {
    int insert(Module record);

    int insertSelective(Module record);
}