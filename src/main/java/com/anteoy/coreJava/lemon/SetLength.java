package com.anteoy.coreJava.lemon;

/**
 * Created by zhoudazhuang
 * Date: 16-12-12
 * Time: 上午11:17
 * Description :
 */
public class SetLength {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc+");
        stringBuffer.append("def");
        System.out.println(stringBuffer.toString());
        stringBuffer.setLength(0);
        stringBuffer.append("+ghi");
        System.out.println(stringBuffer.toString());

    }
}
