package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName ItemsServiceImpl
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2020/2/7 11:16
 * @Version V1.0
 */
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsDao itemsDao;

    public List<Items> findAll() {
        List<Items> list = itemsDao.findAll();
        return list;
    }

    public int save(Items items) {
        int rows = itemsDao.save(items);
        return rows;
    }
}
