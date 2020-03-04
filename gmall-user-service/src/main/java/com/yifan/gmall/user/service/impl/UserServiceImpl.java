package com.yifan.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yifan.gmall.bean.UmsMember;
import com.yifan.gmall.bean.UmsMemberReceiveAddress;
import com.yifan.gmall.service.UserService;
import com.yifan.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.yifan.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> ReceiveAdderssByMemberId(String memberId) {
        // 封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);


//        Example example = new Example(UmsMemberReceiveAddress.class);
//        example.createCriteria().andEqualTo("memberId",memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddresses;
    }
}
