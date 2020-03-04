package com.yifan.gmall.service;

import com.yifan.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String attrService(PmsBaseAttrInfo pmsBaseAttrInfo);
}
