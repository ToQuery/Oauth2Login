package com.toquery.oauth2.model.sys.service.impl;

import com.toquery.oauth2.model.sys.dao.TbUserBaseMapper;
import com.toquery.oauth2.model.sys.entity.po.TbUserBase;
import com.toquery.oauth2.model.sys.service.IUserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heima on 2016/7/7.
 */
@Service
public class UserBaseServiceImpl implements IUserBaseService {

    @Autowired
    private TbUserBaseMapper userBaseMapper;

    /**
     * 通过登录名获取账号信息
     *
     * @param loginName 登录名
     * @return 账号信息
     */
    @Override
    public TbUserBase getByLoginName(String loginName) {
        return userBaseMapper.getByLoginName(loginName);
    }

    /**
     * 获取全部的用户信息
     *
     * @return
     */
    @Override
    public List<TbUserBase> findAll() {
        return userBaseMapper.findAll();
    }

    @Override
    public void createUser(TbUserBase user) {
        userBaseMapper.insert(user);
    }

    @Override
    public TbUserBase findOne(Integer id) {
        return userBaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateUser(TbUserBase user) {
        userBaseMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userBaseMapper.deleteByPrimaryKey(id);
    }
}
