//package com.example.mybatisdemo.controller;
//
//import com.example.mybatisdemo.service.UserInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class UserInfoController {
//
//    @Autowired
//    private UserInfoService userInfoService;
//
//
//    @GetMapping("/user/all")
//    public List<UserInfo> getAll() {
//
//
//        return userInfoService.selectAll();
//    }
//
////
////    @PostMapping("/user/store")
////    public UserInfo getAll(UserInfo userInfo) {
////        return userInfoService.store(userInfo);
////    }
//
//}
