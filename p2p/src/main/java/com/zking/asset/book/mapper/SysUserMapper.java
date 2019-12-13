package com.zking.asset.book.mapper;

import com.zking.asset.book.model.SysUser;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.Set;

@Repository
public interface SysUserMapper {

    //根据用户账号获取用户登录信息
    SysUser userlogin(String username) throws SQLException;

    //根据username查询该用户的所有角色，用于角色验证
    Set<String> findRoles(String username);

    //根据username查询他所拥有的权限信息，用于权限判断
    Set<String> findPermissions(String username);
}