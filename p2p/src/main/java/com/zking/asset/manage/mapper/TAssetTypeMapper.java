package com.zking.asset.manage.mapper;

import com.zking.asset.manage.model.TAssetType;

public interface TAssetTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAssetType record);

    int insertSelective(TAssetType record);

    TAssetType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAssetType record);

    int updateByPrimaryKey(TAssetType record);
}