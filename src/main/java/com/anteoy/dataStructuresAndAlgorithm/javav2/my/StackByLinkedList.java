package com.anteoy.dataStructuresAndAlgorithm.javav2.my;

import java.util.LinkedList;

/**
 * Created by zhoudazhuang on 17-3-2.
 * Description:
 */
public class StackByLinkedList {

    public static void main(String[] args) {
        useLinkedListAsLIFO();
    }
    /**
     * 将LinkedList当作 LIFO(后进先出)的堆栈
     */
    private static void useLinkedListAsLIFO() {
        // 新建一个LinkedList
        LinkedList stack = new LinkedList();

        // 将1,2,3,4添加到堆栈中
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        // 打印“栈”
        System.out.println(stack);

        // 删除“栈顶元素”
        System.out.println("stack.pop():"+stack.pop());

        // 取出“栈顶元素”
        System.out.println("stack.peek():"+stack.peek());

        // 打印“栈”
        System.out.println("stack:"+stack);
    }
}
