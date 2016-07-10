package com.toquery.oauth2.core.config.utils.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;

public class Des3Utils {

    // 定义加密算法，DESede即3DES
    private static final String Algorithm = "DESede/ECB/PKCS5Padding";

    private static final String CHAT_SET = "utf-8";

    /**
     * 加密
     *
     * @param data   传入数据
     * @param keyStr 加密key
     * @return
     */
    public static String encryption(String data, String keyStr) {
        try {
            Cipher cipher = Cipher.getInstance(Algorithm);
            SecretKeySpec key = new SecretKeySpec(build3DesKey(keyStr), "DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] dateByte = cipher.doFinal(data.getBytes(CHAT_SET));
            return Base64Utils.encodeBase64(dateByte);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     *
     * @param data   传入数据
     * @param keyStr 解密key
     * @return
     */
    public static String decryption(String data, String keyStr) {
        try {
            Cipher cipher = Cipher.getInstance(Algorithm);
            SecretKeySpec key = new SecretKeySpec(build3DesKey(keyStr), "DESede");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] byteFinal = cipher.doFinal(Base64Utils.decodeBase64(data));
            return new String(byteFinal, CHAT_SET);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
        * 根据字符串生成密钥字节数组
         * @param keyStr 密钥字符串
         * @return
         * @throws UnsupportedEncodingException
         */
    public static byte[] build3DesKey(String keyStr) throws UnsupportedEncodingException {
        byte[] key = new byte[24];    //声明一个24位的字节数组，默认里面都是0
//        byte[] temp = keyStr.getBytes("UTF-8");    //将字符串转成字节数组
        byte[] temp = keyStr.getBytes(CHAT_SET);    //将字符串转成字节数组
        if (key.length > temp.length) {
            //如果temp不够24位，则拷贝temp数组整个长度的内容到key数组中
            System.arraycopy(temp, 0, key, 0, temp.length);
        } else {
            //如果temp大于24位，则拷贝temp数组24个长度的内容到key数组中
            System.arraycopy(temp, 0, key, 0, key.length);
        }
        return key;
    }
}
