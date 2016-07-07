package com.toquery.oauth2.model.sys.service;

import com.toquery.oauth2.model.sys.entity.po.TbUserBase;

import java.util.List;

/**
 * Created by heima on 2016/7/7.
 */
public interface IUserBaseService {
    /**
     * 通过登录名获取账号信息
     *
     * @param loginName 登录名
     * @return 账号信息
     */
    TbUserBase getByLoginName(String loginName);

    /**
     * 获取全部的用户信息
     *
     * @return
     */
    List<TbUserBase> findAll();

    void createUser(TbUserBase user);

    TbUserBase findOne(Integer id);

    void updateUser(TbUserBase user);

    void deleteUser(Integer id);
}
