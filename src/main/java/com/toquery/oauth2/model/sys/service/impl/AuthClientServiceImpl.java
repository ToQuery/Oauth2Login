package com.toquery.oauth2.model.sys.service.impl;

import com.toquery.oauth2.model.sys.dao.TbAuthClientMapper;
import com.toquery.oauth2.model.sys.entity.po.TbAuthClient;
import com.toquery.oauth2.model.sys.service.IAuthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heima on 2016/7/7.
 */
@Service
public class AuthClientServiceImpl implements IAuthClientService {

    @Autowired
    private TbAuthClientMapper authClientMapper;

    @Override
    public boolean checkClientId(String clientId) {
        return authClientMapper.getByClientId(clientId) == null ? false : true;
    }

    public TbAuthClient getByClientId(String clientId) {
        return authClientMapper.getByClientId(clientId);
    }

    @Override
    public TbAuthClient getByClientSecret(String clientSecret) {
        return authClientMapper.getByClientSecret(clientSecret);
    }

    @Override
    public List<TbAuthClient> getAll() {
        return authClientMapper.getAll();
    }

    @Override
    public void createClient(TbAuthClient client) {
        authClientMapper.insert(client);
    }

    @Override
    public TbAuthClient getById(Integer id) {
        return authClientMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateClient(TbAuthClient client) {
        authClientMapper.updateByPrimaryKey(client);
    }

    @Override
    public Integer deleteById(Integer id) {
        return authClientMapper.deleteByPrimaryKey(id);
    }
}
