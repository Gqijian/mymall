package com.gao.mymall.impl;

import com.gao.common.pojo.EasyUIDataGridResult;
import com.gao.mymall.mapper.TbItemMapper;
import com.gao.mymall.pojo.TbItem;
import com.gao.mymall.pojo.TbItemExample;
import com.gao.mymall.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program:mymall
 * @Description:
 * @Author Gqjian
 * @Create 2018/10/3 17:50:14
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        //1.设置分页信息使用pagehelper
        if (page==null){
            page = 1;
        }
        if (rows == null) rows = 30;
        PageHelper.startPage(page, rows);
        //2.注入mapper
        //3.创建对象 不需要设置查询条件
        TbItemExample example = new TbItemExample();
        //4.根据mapper调用查询所有数据的方法
        List<TbItem> list = tbItemMapper.selectByExample(example);
        //5.获取分页信息
        PageInfo<TbItem> info = new PageInfo<>(list);
        //6.封装到EasyUIDataGridResult
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal((int) info.getTotal());
        result.setRows(info.getList());
        //7.返回
        return result;
    }
}
