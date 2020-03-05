package com.yifan.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yifan.gmall.bean.PmsBaseAttrInfo;
import com.yifan.gmall.bean.PmsBaseAttrValue;
import com.yifan.gmall.bean.PmsBaseSaleAttr;
import com.yifan.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;

    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList( ){
        List<PmsBaseSaleAttr> pmsBaseSaleAttrs = attrService.baseSaleAttrList();
        return pmsBaseSaleAttrs;
    }

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }


    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){

        String success = attrService.attrService(pmsBaseAttrInfo);

        return "success";
    }

    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        List<PmsBaseAttrValue> pmsBaseAttrValues = attrService.getAttrValueList(attrId);
        return pmsBaseAttrValues;
    }
}
