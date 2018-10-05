package com.gao.mymall.controller;

import com.gao.common.pojo.EasyUIDataGridResult;
import com.gao.mymall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program:mymall
 * @Description:
 * @Author Gqjian
 * @Create 2018/10/5 15:20:28
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/list", method = RequestMethod.GET)
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows){

        return itemService.getItemList(page,rows);
    }
}
