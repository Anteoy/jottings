package com.anteoy.coreJava.notejava;

/**
 * Created by zhoudazhuang on 18-6-21.
 */
public class StringRevert {
    /**
     * 二分递归地将后面的字符和前面的字符连接起来。
     *
     * @param s
     * @return
     */
    public static String reverse(String s) {
        synchronized (StringRevert.class) {
            int length = s.length();
            if (length <= 1)
                return s;
            String left = s.substring(0, length / 2);
            String right = s.substring(length / 2, length);
            System.out.println("==============");
            System.out.println("string is :"+ s);
            System.out.println("left:" +left);
            System.out.println("right:"+right);
            // 这里如果这样递归打印 是有问题的
            // System.out.println("left + right :" +reverse1(right) + reverse1(left));
            return reverse(right) + reverse(left);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcdef"));

    }
}

