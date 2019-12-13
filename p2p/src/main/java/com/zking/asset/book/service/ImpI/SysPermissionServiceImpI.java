package com.zking.asset.book.service.ImpI;

import com.zking.asset.book.mapper.SysPermissionMapper;
import com.zking.asset.book.model.SysPermission;
import com.zking.asset.book.service.ISysPermissionService;
import com.zking.asset.book.vo.SysPermissionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class SysPermissionServiceImpI implements ISysPermissionService{

    @Autowired
    private SysPermissionMapper sysPermissionMapper;



    @Override
    public List<SysPermissionVo> queryRootNodes(SysPermission sysPermission) {

        return sysPermissionMapper.queryRootNodes(sysPermission);
    }

    @Override
    public List<SysPermissionVo> queryRootPid(Integer pid, SysPermissionVo sysPermissionVo) {

        //二级菜单查询
        List<SysPermissionVo> sysPermissionVos=sysPermissionMapper.queryRootPid(pid);

        for (SysPermissionVo permissionVo : sysPermissionVos) {
            //将查询出来的二级菜单perid，跟permissionVo对象传入三级菜单方法
            queryRootPidto(permissionVo.getPerid(),permissionVo);
        }

        sysPermissionVo.setChild(sysPermissionVos);

        return sysPermissionVos;

    }

    //三级菜单查询
    public void queryRootPidto(Integer pid, SysPermissionVo sysPermissionVo){
        List<SysPermissionVo> sysPermissionVos = sysPermissionMapper.queryRootPid(pid);
        System.err.println(sysPermissionVos);
        sysPermissionVo.setChild(sysPermissionVos);
    }


}
