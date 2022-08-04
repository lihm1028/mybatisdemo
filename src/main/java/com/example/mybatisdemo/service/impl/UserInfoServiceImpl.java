//package com.example.mybatisdemo.service.impl;
//
//import com.example.mybatisdemo.mapper.UserInfoMapper;
//import com.example.mybatisdemo.service.UserInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserInfoServiceImpl implements UserInfoService {
//
//    @Autowired
//    private UserInfoMapper userInfoMapper;
//
//
//    @Override
//    public UserInfo store(UserInfo userInfo) {
//
//        int id;
//
//        if (userInfo.getId() != null) {
//            id = userInfoMapper.updateByPrimaryKey(userInfo);
//        } else {
//            id = userInfoMapper.insert(userInfo);
//        }
//        return userInfoMapper.selectByPrimaryKey(id);
//    }
//
//    @Override
//    public List<UserInfo> selectAll() {
//        List<UserInfo> userInfos = userInfoMapper.selectAll();
//        return userInfos;
//    }
//}
