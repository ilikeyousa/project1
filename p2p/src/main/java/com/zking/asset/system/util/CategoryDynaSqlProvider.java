package com.zking.asset.system.util;

import org.apache.ibatis.jdbc.SQL;
public class CategoryDynaSqlProvider {

    public String list(){
     return new SQL()
             .SELECT("*")
             .FROM("t_user")
             .toString();
    }
}
