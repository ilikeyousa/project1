package com.zking.asset.system.service;

import com.zking.asset.system.model.User;

import java.util.List;

public interface IUserService {
    int queryUserByStart(String username);

    List<User> queryUserBy();
}