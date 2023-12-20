package com.zzm.mhl.service;

import com.zzm.mhl.dao.DiningTableDAO;
import com.zzm.mhl.domain.DiningTable;

import java.util.List;

/**
 * @author Mingson
 * @version 1.0
 */
public class DiningTableService {// 业务层
    // 定义一个DiningTableDAO对象
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    // 返回所有餐桌的信息
    public List<DiningTable> list() {
        return diningTableDAO.queryMulti("select id, state from diningTable", DiningTable.class);
    }
}
