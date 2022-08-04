package com.example.mybatisdemo.service;

import com.example.mybatisdemo.model.UserInfo;

import java.util.List;

public interface UserInfoService {

    UserInfo store(UserInfo userInfo);

    List<UserInfo> selectAll();
}
