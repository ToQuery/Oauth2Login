package com.toquery.oauth2.core.config.utils.security;

import com.google.common.base.Strings;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ToQuery on 2016-03-24.
 */
public class MD5Util {


    //静态方法，便于作为工具类
    public static String EncoderByMd5(String plainText) {
        if (Strings.isNullOrEmpty(plainText)) {
            return null;
        }
        //32位加密
        return EncoderOriginalByMd5(plainText).toUpperCase();
    }


    //静态方法，便于作为工具类
    public static String EncoderOriginalByMd5(String plainText) {
        if (Strings.isNullOrEmpty(plainText)) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //32位加密
            return buf.toString();
            // 16位的加密
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

}
