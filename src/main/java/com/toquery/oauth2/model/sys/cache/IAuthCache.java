package com.toquery.oauth2.model.sys.cache;

/**
 * Created by heima on 2016/7/7.
 */
public interface IAuthCache {


    /**
     * 添加 auth code
     *
     * @param authCode
     * @param username
     */
    public void addAuthCode(String authCode, String username);


    /**
     * 添加 access token
     *
     * @param accessToken
     * @param username
     */
    public void addAccessToken(String accessToken, String username);


    /**
     * 验证auth code是否有效
     *
     * @param authCode
     * @return
     */
    boolean checkAuthCode(String authCode);


    /**
     * 验证access token是否有效
     *
     * @param accessToken
     * @return
     */
    boolean checkAccessToken(String accessToken);

    /**
     * 通过authCode 获取 username
     *
     * @param authCode
     * @return
     */
    String getUsernameByAuthCode(String authCode);

    /**
     * 通过accessToken 获取 username
     *
     * @param accessToken
     * @return
     */
    String getUsernameByAccessToken(String accessToken);

    /**
     * auth code accesstoken 过期时间
     *
     * @return
     */
    long getExpireIn();


    /**
     * 检测指定clientId的授权应用对象是否存在
     *
     * @param clientId
     * @return true 存在 false 不存在
     */
    public boolean checkClientId(String clientId);

    /**
     * 检测指定 clientSecret 的授权应用对象是否存在
     *
     * @param clientSecret
     * @return true 存在 false 不存在
     */
    public boolean checkClientSecret(String clientSecret);

}
