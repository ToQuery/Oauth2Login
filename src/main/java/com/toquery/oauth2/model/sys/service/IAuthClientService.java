package com.toquery.oauth2.model.sys.service;

import com.toquery.oauth2.model.sys.entity.po.TbAuthClient;

import java.util.List;

/**
 * Created by heima on 2016/7/7.
 */
public interface IAuthClientService {
    boolean checkClientId(String clientId);

    public TbAuthClient getByClientId(String clientId);

    TbAuthClient getByClientSecret(String clientSecret);

    List<TbAuthClient> getAll();

    void createClient(TbAuthClient client);

    TbAuthClient getById(Integer id);

    void updateClient(TbAuthClient client);

    Integer deleteById(Integer id);
}
