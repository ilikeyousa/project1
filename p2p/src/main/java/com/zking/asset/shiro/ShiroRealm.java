package com.zking.asset.shiro;

import com.zking.asset.book.model.SysUser;
import com.zking.asset.book.service.ISysUserSerice;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.chrono.IsoChronology;
import java.util.Set;

@Slf4j
public class ShiroRealm  extends AuthorizingRealm{

    //与数据库进行交互
    @Autowired
    private ISysUserSerice iSysUserSerice;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
      //获取用户登录信息
        String username = principalCollection.getPrimaryPrincipal().toString();
        //根据用户名获取角色
        Set<String> roles = iSysUserSerice.findRoles(username);
        //根据用户名获取权限
        Set<String> permissions = iSysUserSerice.findPermissions(username);

        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.setStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       //获取账号密码
        String username = authenticationToken.getPrincipal().toString();
        String password = authenticationToken.getCredentials().toString();
        log.info("username={},password={}",username,password);

        //进行身份验证
        SysUser userlogin=null;
        try {
             userlogin = iSysUserSerice.userlogin(username);
             //判断userlogin是否为空
            if(userlogin==null){
                throw new UnknownAccountException("账号错误");
            }
            SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(
                    userlogin.getUsername(),
                    userlogin.getPassword(),
                    ByteSource.Util.bytes(userlogin.getSalt()),
                    this.getName()

            );
            return simpleAuthenticationInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
}
