package com.zking.asset.book.mapper;

import com.zking.asset.book.model.SysPermission;
import com.zking.asset.book.vo.BookFileVo;
import com.zking.asset.book.vo.SysPermissionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysPermissionMapper {

    public List<SysPermissionVo> queryRootNodes(SysPermission sysPermission);

    public List<SysPermissionVo> queryRootPid(Integer perids);
}