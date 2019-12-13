package com.zking.asset.book.service;

import com.zking.asset.book.model.SysPermission;
import com.zking.asset.book.vo.SysPermissionVo;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ISysPermissionService {

    public List<SysPermissionVo> queryRootNodes(SysPermission sysPermission);

    public List<SysPermissionVo> queryRootPid(Integer pid, SysPermissionVo sysPermissionVo);
}