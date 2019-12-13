package com.zking.asset.book.contorller;

import com.zking.asset.book.model.SysUser;
import com.zking.asset.book.service.ISysUserSerice;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequestMapping("/sysuser")
public class UserContrller {

    //@Autowired
    //private ISysUserSerice iSysUserSerice;

    @RequestMapping("/userLogin")
    public ModelAndView userLogin(SysUser sysUser){
        //1.获取登陆所需要的账号密码
        //2.获取主体
        Subject subject = SecurityUtils.getSubject();
        //3.创建用户名密码的token令牌
        UsernamePasswordToken token=new UsernamePasswordToken(
                sysUser.getUsername(),
                sysUser.getPassword()
        );

        String massage=null;

        try {
            //身份认证
            subject.login(token);
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            massage="账号错误";
        } catch (IncorrectCredentialsException e){
            e.printStackTrace();
            massage="密码错误";
        }

        ModelAndView mv=new ModelAndView();
        if(null==massage){
           mv.setViewName("indexs");
        }else{
           mv.setViewName("login");
           mv.addObject("msg",massage);
        }
        return mv;

    }

    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/home/index.shtml";
    }
}
