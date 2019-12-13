package com.zking.asset.system.mapper;


import com.zking.asset.system.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int queryUserByStart(String username);

    //动态sql
    @SelectProvider(type=com.zking.asset.system.util.CategoryDynaSqlProvider.class,method = "list")
    List<User> queryUserBy();

}