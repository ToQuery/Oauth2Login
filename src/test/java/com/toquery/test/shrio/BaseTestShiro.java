package com.toquery.test.shrio;

import com.toquery.test.BaseTest;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;

/**
 * Created by heima on 2016/7/7.
 */
public class BaseTestShiro extends BaseTest {

    @Test
    public void testEncode1() {
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

    /**
     * shrio 加密方式
     *
     * */
    @Test
    public void testEncode2() {
        String password3 =  new SimpleHash("md5","123456", ByteSource.Util.bytes("admin8d78869f470951332959580424d4bf4f"),2).toHex();

        String password4 =  new SimpleHash("md5","123456").toString();

        System.out.println(password3);
        System.out.println(password4);
    }
}
