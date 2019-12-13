package com.zking.asset.system.service.ImpI;

import com.zking.asset.system.mapper.UserMapper;
import com.zking.asset.system.model.User;
import com.zking.asset.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpI implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int queryUserByStart(String username) {
        return userMapper.queryUserByStart(username);
    }

    @Override
    public List<User> queryUserBy() {
        return userMapper.queryUserBy();
    }
}
