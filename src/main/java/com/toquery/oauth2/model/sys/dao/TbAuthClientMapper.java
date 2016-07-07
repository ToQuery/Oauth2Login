package com.toquery.oauth2.model.sys.dao;

import com.toquery.oauth2.core.repository.MyBatisRepository;
import com.toquery.oauth2.model.sys.entity.po.TbAuthClient;

import java.util.List;

@MyBatisRepository
public interface TbAuthClientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAuthClient record);

    int insertSelective(TbAuthClient record);

    TbAuthClient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAuthClient record);

    int updateByPrimaryKey(TbAuthClient record);

    TbAuthClient getByClientId(String clientId);

    TbAuthClient getByClientSecret(String clientSecret);

    List<TbAuthClient> getAll();
}