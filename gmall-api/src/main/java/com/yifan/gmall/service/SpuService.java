package com.yifan.gmall.service;

import com.yifan.gmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
