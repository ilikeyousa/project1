package com.zking.asset.manage.mapper;

import com.zking.asset.manage.model.TAssetRepair;

public interface TAssetRepairMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAssetRepair record);

    int insertSelective(TAssetRepair record);

    TAssetRepair selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAssetRepair record);

    int updateByPrimaryKey(TAssetRepair record);
}