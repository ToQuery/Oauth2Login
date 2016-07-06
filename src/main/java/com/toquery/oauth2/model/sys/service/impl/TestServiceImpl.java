package com.toquery.oauth2.model.sys.service.impl;

import com.toquery.oauth2.model.sys.dao.TbUserBaseMapper;
import com.toquery.oauth2.model.sys.entity.po.TbUserBase;
import com.toquery.oauth2.model.sys.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ToQuery on 2016-07-06.
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TbUserBaseMapper userBaseMapper;

    @Override
    public TbUserBase getById() {
        return userBaseMapper.selectByPrimaryKey(1);
    }
}
