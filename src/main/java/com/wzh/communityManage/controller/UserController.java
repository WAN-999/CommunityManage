package com.wzh.communityManage.controller;

import com.wzh.communityManage.entity.User;
import com.wzh.communityManage.serviceImpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserServiceImpl userService;

    @PostMapping("/add")
    public String addUser(@RequestBody HttpServletRequest httpServletRequest, HttpSession httpSession, User user) {
        int success = userService.addUser(user);
        if (success == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
