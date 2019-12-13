package com.zking.asset.book.service.ImpI;

import com.zking.asset.book.mapper.SysUserMapper;
import com.zking.asset.book.model.SysUser;
import com.zking.asset.book.service.ISysUserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Set;

@Service
public class SysUserImpI implements ISysUserSerice {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser userlogin(String username) throws Exception {
        return sysUserMapper.userlogin(username);
    }

    @Override
    public Set<String> findRoles(String username) {
        return sysUserMapper.findRoles(username);
    }

    @Override
    public Set<String> findPermissions(String username) {
        return sysUserMapper.findPermissions(username);
    }
}
