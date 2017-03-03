package com.anteoy.dataStructuresAndAlgorithm.javav2.my;

/**
 * Created by zhoudazhuang on 17-3-3.
 * Description:二叉堆binaryheap实现优先队列（堆）测试类
 */
public class GoBinaryHeapTest {
    public static void main(String[] args) {
        GoBinaryHeap<Integer> heap = new GoBinaryHeap<>();
        for (int i = 0; i < 10; i++) {
            heap.insert(i);
        }
        heap.deleteMin();
        heap.deleteMin();
        heap.deleteMin();
        heap.printHeap();
    }
}
