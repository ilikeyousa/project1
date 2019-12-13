package com.zking.asset.manage.mapper;

import com.zking.asset.manage.model.TAsset;

public interface TAssetMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAsset record);

    int insertSelective(TAsset record);

    TAsset selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAsset record);

    int updateByPrimaryKey(TAsset record);
}