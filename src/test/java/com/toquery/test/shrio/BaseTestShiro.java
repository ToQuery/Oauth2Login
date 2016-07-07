package com.toquery.test.shrio;

import com.toquery.test.BaseTest;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

/**
 * Created by heima on 2016/7/7.
 */
public class BaseTestShiro extends BaseTest {

    @Test
    public void testEncode() {
        String algorithmName = "md5";
        String username = "admin";
        String password = "123456";
        String salt1 = username;
        String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();
        int hashIterations = 2;

        SimpleHash hash = new SimpleHash(algorithmName, password, salt1 + salt2, hashIterations);
        String encodedPassword = hash.toHex();

        System.out.println(encodedPassword);
    }
}
