package com.toquery.oauth2.model.sys.dao;

import com.toquery.oauth2.core.repository.MyBatisRepository;
import com.toquery.oauth2.model.sys.entity.po.TbUserBase;

import java.util.List;

@MyBatisRepository
public interface TbUserBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUserBase record);

    int insertSelective(TbUserBase record);

    TbUserBase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUserBase record);

    int updateByPrimaryKey(TbUserBase record);

    /**
     * 通过登录名获取账号信息
     *
     * @param loginName  登录名
     * @return  账号信息
     */
    TbUserBase getByLoginName(String loginName);

    /**
     * 获取全部的用户信息
     *
     * @return
     */
    List<TbUserBase> findAll();
}