package com.anteoy.sample.ComparableComparator;

import java.util.Comparator;

/**
 * Created by zhoudazhuang
 * Date: 16-11-18
 * Time: 上午10:06
 * Description :Comparator接口
 * <p>
 * 与上面的Comparable接口不同的是：
 * <p>
 * ①、Comparator位于包java.util下，而Comparable位于包java.lang下。
 * <p>
 * ②、Comparable接口将比较代码嵌入需要进行比较的类的自身代码中，而Comparator接口在一个独立的类中实现比较。
 * <p>
 * ③、如果前期类的设计没有考虑到类的Compare问题而没有实现Comparable接口，后期可以通过Comparator接口来实现比较算法进行排序，并且为了使用不同的排序标准做准备，比如：升序、降序。
 * <p>
 * ④、Comparable接口强制进行自然排序，而Comparator接口不强制进行自然排序，可以指定排序顺序
 */

/**
 * 具体的比较类（比较器），实现Comparator接口
 *
 * @author breeze
 */
public class ComparatorConsunInfo implements Comparator<ConsumInfoComparatorPOJO> {
    /**
     * 顺序（从小到大）：
     * if(price < o.price){
     * return -1;
     * }
     * if(price > o.price){
     * return 1;
     * }
     * 倒序（从大到小）：
     * if(price < o.price){
     * return 1;
     * }
     * if(price > o.price){
     * return -1;
     * }
     */
    @Override
    public int compare(ConsumInfoComparatorPOJO o1, ConsumInfoComparatorPOJO o2) {
        //首先比较price，如果price相同，则比较uid
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        }

        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }

        if (o1.getPrice() == o2.getPrice()) {
            if (o1.getUid() > o2.getUid()) {
                return 1;
            }
            if (o1.getUid() < o2.getUid()) {
                return -1;
            }
        }
        return 0;
    }
}
