package com.yifan.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yifan.gmall.bean.UmsMember;
import com.yifan.gmall.bean.UmsMemberReceiveAddress;
import com.yifan.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getReceiveAdderssByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAdderssByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.ReceiveAdderssByMemberId(memberId);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
