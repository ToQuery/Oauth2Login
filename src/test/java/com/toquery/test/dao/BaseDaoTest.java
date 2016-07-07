package com.toquery.test.dao;

import com.toquery.oauth2.model.sys.dao.TbAuthClientMapper;
import com.toquery.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ToQuery on 2016-07-07.
 */
public class BaseDaoTest extends BaseTest {

    @Autowired
    private TbAuthClientMapper authClientMapper;

    @Test
    public void testDao1() {
        authClientMapper.selectByPrimaryKey(1);
    }
}
