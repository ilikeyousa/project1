package com.zking.asset.book.vo;

import com.zking.asset.book.model.SysPermission;
import lombok.Data;

import java.util.List;
@Data
public class SysPermissionVo extends SysPermission{

    private List<SysPermissionVo> child;
}
