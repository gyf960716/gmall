package com.yifan.gmall.service;

import com.yifan.gmall.bean.PmsProductImage;
import com.yifan.gmall.bean.PmsProductInfo;
import com.yifan.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    public List<PmsProductImage> spuImageList(String spuId);
}
