package com.toquery.oauth2.model.sys.cache.impl;

import com.toquery.oauth2.model.sys.cache.IAuthCache;
import com.toquery.oauth2.model.sys.service.IAuthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

/**
 * Created by heima on 2016/7/7.
 */
@Component
public class AuthCacheImpl implements IAuthCache {

    private Cache cache;

    @Autowired
    public void setCache(CacheManager cacheManager) {
        this.cache = cacheManager.getCache("code-cache");
    }

    @Autowired
    private IAuthClientService authClientService;

    @Override
    public void addAuthCode(String authCode, String username) {
        cache.put(authCode, username);
    }

    @Override
    public void addAccessToken(String accessToken, String username) {
        cache.put(accessToken, username);
    }

    @Override
    public String getUsernameByAuthCode(String authCode) {
        return (String) cache.get(authCode).get();
    }

    @Override
    public String getUsernameByAccessToken(String accessToken) {
        return (String) cache.get(accessToken).get();
    }

    @Override
    public boolean checkAuthCode(String authCode) {
        return cache.get(authCode) != null;
    }

    @Override
    public boolean checkAccessToken(String accessToken) {
        return cache.get(accessToken) != null;
    }

    /**
     * 检测指定clientId的授权应用对象是否存在
     *
     * @param clientId
     * @return true 存在 false 不存在
     */
    @Override
    public boolean checkClientId(String clientId) {
        return authClientService.getByClientId(clientId) != null;
    }

    /**
     * 检测指定 clientSecret 的授权应用对象是否存在
     *
     * @param clientSecret
     * @return true 存在 false 不存在
     */
    @Override
    public boolean checkClientSecret(String clientSecret) {
        return authClientService.getByClientSecret(clientSecret) != null;
    }

    /**
     * auth code accesstoken 过期时间
     *
     * @return
     */
    @Override
    public long getExpireIn() {
        return 3600L;
    }

}
