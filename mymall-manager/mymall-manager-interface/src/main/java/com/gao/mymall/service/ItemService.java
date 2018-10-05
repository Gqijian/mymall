package com.gao.mymall.service;

import com.gao.common.pojo.EasyUIDataGridResult;

/**
 * @Program:mymall
 * @Description:商品相关的处理的Service接口
 * @Author Gqjian
 * @Create 2018/10/3 17:46:30
 */
public interface ItemService {

    /**
     * 根据当前页码和每页行数进行查询
     * @param page
     * @param rows
     * @return
     */
    public EasyUIDataGridResult getItemList(Integer page, Integer rows);
}
