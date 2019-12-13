package com.zking.asset.manage.mapper;

import com.zking.asset.manage.model.TAssetTransfer;

public interface TAssetTransferMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAssetTransfer record);

    int insertSelective(TAssetTransfer record);

    TAssetTransfer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAssetTransfer record);

    int updateByPrimaryKey(TAssetTransfer record);
}