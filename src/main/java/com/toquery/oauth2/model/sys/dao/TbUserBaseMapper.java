package com.toquery.oauth2.model.sys.dao;


import com.toquery.oauth2.core.repository.MyBatisRepository;
import com.toquery.oauth2.model.sys.entity.po.TbUserBase;

@MyBatisRepository
public interface TbUserBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUserBase record);

    int insertSelective(TbUserBase record);

    TbUserBase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUserBase record);

    int updateByPrimaryKey(TbUserBase record);
}