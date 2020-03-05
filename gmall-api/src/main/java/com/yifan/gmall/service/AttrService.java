package com.yifan.gmall.service;

import com.yifan.gmall.bean.PmsBaseAttrInfo;
import com.yifan.gmall.bean.PmsBaseAttrValue;
import com.yifan.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String attrService(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
