package com.anteoy.coreJava.tmp;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhoudazhuang
 * @date 19-4-17 10:45
 * @description
 */
public class ArrangeAndCombineRecur {
    public static void arrange(String sorted, List<Integer> list) {
        if(list.size()==1) {
            System.out.println(sorted + list.get(0));
        } else {
            for(int i=0; i<list.size(); i++) {
                List<Integer> dest = new ArrayList<Integer>();
                dest.addAll(list);
                int n = dest.remove(i);
                arrange(sorted+n, dest);
            }
        }
    }

    public static void arrangeStr(String sorted, List<Character> list) {
        if(list.size() == 1) {
            System.out.println(sorted + list.get(0));
        } else {
            for(int i=0; i<list.size(); i++) {
                List<Character> dest = new ArrayList<>();
                dest.addAll(list);
                char n = dest.remove(i);
                arrangeStr(sorted+n, dest);
            }
        }
    }

    public static void arrange(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        arrange("", list);
    }

    public static void arrangeStr(String str) {
        char[] list = str.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (Character character: list){
           characters.add(character);
        }
        arrangeStr("", characters);
    }

    public static void main(String []args) {
//        arrange(3);
//        arrangeStr("abca");
        String s = "abc";
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer("");
        int len = c.length;
        for (int i=1;i<=len;i++){
            combineRecursive(c,0,i,sb);
        }
    }

    static void combineRecursive(char[] c,int begin, int len, StringBuffer sb){
        if (len == 0){
            System.out.print(sb+" ");
            return;
        }
        if (begin == c.length) {
            return;
        }
        sb.append(c[begin]);
        combineRecursive(c,begin+1, len-1, sb);
        sb.deleteCharAt(sb.length()-1);
        combineRecursive(c,begin+1,len,sb);
    }
}

