package com.itheima.ssm.service;

import com.itheima.ssm.domain.Items;

import java.util.List;

public interface ItemsService {
    // 查询所有
    List<Items> findAll();
    // 保存
    int save(Items items);
}
