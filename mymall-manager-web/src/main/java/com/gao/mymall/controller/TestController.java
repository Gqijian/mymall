package com.gao.mymall.controller;

import com.gao.mymall.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program:mymall
 * @Description:测试使用
 * @Author Gqjian
 * @Create 2018/9/29 10:55:22
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/queryNow")
    @ResponseBody
    public String queryNow(){

        return testService.queryNow();
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("成功");
        return "index";
    }
}
