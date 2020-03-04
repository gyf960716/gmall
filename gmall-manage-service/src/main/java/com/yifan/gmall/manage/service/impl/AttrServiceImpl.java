package com.yifan.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yifan.gmall.bean.PmsBaseAttrInfo;
import com.yifan.gmall.bean.PmsBaseAttrValue;
import com.yifan.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.yifan.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.yifan.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfoList = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfoList;
    }

    @Override
    public String attrService(PmsBaseAttrInfo pmsBaseAttrInfo) {

        //保存属性
        pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo); //insertSelective 遇到空值不插入

        //保存属性值
        List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
        for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());

            pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
        }
        return "success";
    }
}
