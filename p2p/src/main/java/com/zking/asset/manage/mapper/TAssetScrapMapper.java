package com.zking.asset.manage.mapper;

import com.zking.asset.manage.model.TAssetScrap;

public interface TAssetScrapMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAssetScrap record);

    int insertSelective(TAssetScrap record);

    TAssetScrap selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAssetScrap record);

    int updateByPrimaryKey(TAssetScrap record);
}