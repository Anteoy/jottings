package com.anteoy.dataStructuresAndAlgorithm.dahaiguai.zhangweiquan;

/**
 * Created by zhangweiquan
 * Generated by zhoudazhuang
 * Date: 17-4-1
 * Time: 上午10:04
 * Description : 把一个链表调换一个顺序（反序，注意便捷和空链表）
 */
public interface reverseList {

    public static void main(String[] args) {
        List<Integer> root = ListUtils.getList(new int[]{1, 2, 3, 4});
        List<Integer> list = reverseList(root);
        while (list != null) {
            System.out.println(list.getValue());
            list = list.getNext();
        }
    }

    public static List<Integer> reverseList(List<Integer> root) {
        if (root == null) {
            return null;
        }
        List<Integer> reversePre = null;//反转后的单链表
        List<Integer> current = root;//原始起始节点 反转后的单链表开始节点
        List<Integer> pre = null;
        while (current != null) {
            List<Integer> next = current.getNext();//每次处理下一个节点
            if (next == null) {//没有下一个节点 则处理完毕
                reversePre = current;//反转后的单链表开始节点
            }
            current.setNext(pre);//指向之前一个节点 于是反向
            pre = current;//pre为每次处理的节点的之前的节点
            current = next;//最后推荐current
        }
        return reversePre;
    }
}

