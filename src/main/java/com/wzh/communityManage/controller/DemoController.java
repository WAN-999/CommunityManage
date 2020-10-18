package com.wzh.communityManage.controller;

import com.wzh.communityManage.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public String demoTest(){
        return "login" ;
    }
}
