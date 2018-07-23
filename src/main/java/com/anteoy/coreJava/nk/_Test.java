package com.anteoy.coreJava.nk;

/**
 * Created by zhoudazhuang on 17-11-23.
 */
public class _Test {
    public static void main(String[] args) {
        int x = 0, y = 0, k = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2)) {
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x + " " + y + " " + k);
    }
}
