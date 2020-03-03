package com.yifan.gmall.service;

import com.yifan.gmall.bean.UmsMember;
import com.yifan.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> ReceiveAdderssByMemberId(String memberId);
}
