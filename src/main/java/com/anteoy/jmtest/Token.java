package com.anteoy.jmtest;

import org.apache.commons.codec.digest.DigestUtils;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @auther zhoudazhuang
 * @date 18-7-25 13:46
 * @description
 */
public class Token {

    public static void main(String[] args) throws Exception {
        String token =
                EncoderByMd5("test" + EncoderByMd5("123456") + System.currentTimeMillis() / 1000);
        System.out.println(token);
        System.out.println("======");
        System.out.println(
                md5("test" + EncoderByMd5("123456") + System.currentTimeMillis() / 1000));
    }

    public static String EncoderByMd5(String str)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // 确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        // 加密后的字符串
        //        String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
        String newstr = bytesToHexString(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 1) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
    /**
     * MD5方法
     *
     * @param key 密钥
     * @return 密文
     * @throws Exception
     */
    public static String md5(String key) throws Exception {
        // 加密后的字符串
        String encodeStr = DigestUtils.md5Hex(key);
        System.out.println("MD5加密后的字符串为:encodeStr=" + encodeStr);
        return encodeStr;
    }

    /**
     * MD5验证方法
     *
     * @param key 密钥
     * @param md5 密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String key, String md5) throws Exception {
        // 根据传入的密钥进行验证
        String md5Text = md5(key);
        if (md5Text.equalsIgnoreCase(md5)) {
            System.out.println("MD5验证通过");
            return true;
        }
        return false;
    }
}
