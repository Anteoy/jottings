package com.anteoy.decisiveBattle.binaryoctalhex;

/**
 * Created by zhoudazhuang on 17-12-12.
 */
public class BitOperator {
    public static void main(String[] args) {
        // 0010
        System.out.println(~2);
        System.out.println(2&3);
        System.out.println(2|3);
        System.out.println(~-5);
        System.out.println(~5);
        System.out.println(13&7);
        System.out.println(5|4);
        System.out.println(-3^3);
        System.out.println(4^8);


        System.out.println(~4);//~ 在golang中相当于单独使用^ golang中 4^8和java中相同 为异或
        //二进制数在内存中是以补码的形式存放的。 在计算过程中也是使用补码计算的

        //  0 0100(表示为补码)
        //  取反的时候符号位也会取反 1 1011(取反之后也是补码形式)
        // 补码转为2进制为: -1 取反(此时符号位不能取反 不能动) -> 1 1010 -> 1 0101  -> -5(10进制)

    }
}
