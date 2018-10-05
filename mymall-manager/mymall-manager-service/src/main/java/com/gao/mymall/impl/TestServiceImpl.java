package com.gao.mymall.impl;

import com.gao.mymall.mapper.TestMapper;
import com.gao.mymall.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Program:mymall
 * @Description:
 * @Author Gqjian
 * @Create 2018/9/28 21:55:24
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryNow() {
        return testMapper.queryNow();
    }
}
