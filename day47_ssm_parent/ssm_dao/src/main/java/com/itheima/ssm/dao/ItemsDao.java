package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Items;

import java.util.List;

/**
 * TODO
 *
 * @auther $ {qixing}
 */
public interface ItemsDao {
    //查询所有
     List<Items> findAll();
     //保存
    int save(Items items);
}
