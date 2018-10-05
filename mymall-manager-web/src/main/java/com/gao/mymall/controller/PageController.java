package com.gao.mymall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program:mymall
 * @Description:显示页面
 * @Author Gqjian
 * @Create 2018/10/2 16:29:01
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    // 显示商品查询的  url:/item-list
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
