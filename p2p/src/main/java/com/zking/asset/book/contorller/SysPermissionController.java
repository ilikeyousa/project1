package com.zking.asset.book.contorller;

import com.zking.asset.book.model.SysPermission;
import com.zking.asset.book.service.ISysPermissionService;
import com.zking.asset.book.vo.SysPermissionVo;
import com.zking.asset.system.util.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/Root")
public class SysPermissionController {

    @Autowired
    private ISysPermissionService iSysPermissionService;



    //左侧菜单栏值绑定
    @ResponseBody
    @RequestMapping("/queryRootNodes")
    public List<SysPermissionVo> queryRootNodes(SysPermission sysPermission, HttpServletResponse response){
        List<SysPermissionVo> sysPermissionVos = iSysPermissionService.queryRootNodes(sysPermission);

        for (SysPermissionVo sysPermissionVo : sysPermissionVos) {
           iSysPermissionService.queryRootPid(sysPermissionVo.getPerid(),sysPermissionVo);
        }

        log.info("sysPermissionVo={}",sysPermissionVos);

        return sysPermissionVos;
    }
}
