package com.zking.asset.manage.mapper;

import com.zking.asset.manage.model.TAssetAllocation;

public interface TAssetAllocationMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAssetAllocation record);

    int insertSelective(TAssetAllocation record);

    TAssetAllocation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAssetAllocation record);

    int updateByPrimaryKey(TAssetAllocation record);
}