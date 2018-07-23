package com.anteoy.dataStructuresAndAlgorithm.dahaiguai.zhangweiquan;

/**
 * Created by zhangweiquan
 * Generated by zhoudazhuang
 * Date: 17-4-1
 * Time: 上午10:05
 * Description : 单向链表 Node 类
 */
public class List<T> {

    // 指向像一个list的指针 这里直接包含下一个
    private List<T> next;

    //当前node节点的值
    private T value;

    public List<T> getNext() {
        return next;
    }

    public void setNext(List<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T t) {
        this.value = t;
    }

    public List(List<T> next, T t) {
        super();
        this.next = next;
        this.value = t;
    }

    public List(T t) {
        super();
        this.value = t;
    }

    public List(List<T> next) {
        super();
        this.next = next;
    }

    public List() {
        super();
    }

    //重写hashCode方法
    @Override
    public int hashCode() {
        //最后一个node的hash计算
        if (this.next == null) {
            return this.value.hashCode();
        } else {
            //除最后一个node的hash计算方法为两者hash值之和
            return this.next.hashCode() + this.value.hashCode();
        }
    }

    public static void main(String[] args) {
        //构造器设值value
        List<Integer> list1 = new List<>(1);
        List<Integer> list2 = new List<>(1);
        List<Integer> list3 = new List<>(2);
        //list的指针指向list3
        list1.setNext(list3);
        //list2的指针指向List3
        list2.setNext(list3);
        System.out.println(list1.equals(list2));
    }

    public boolean equals(List obj) {
        if ((this.next == null && obj.next == null && this.value == obj.value) || this.hashCode() == obj.hashCode()) {
            return true;
        } else {
            return false;
        }

    }


}

