package com.anteoy.sample;

/**
 * Created by zhoudazhuang
 * Date: 16-11-15
 * Time: 下午9:03
 * Description : 在set中或者是hashmap的key值中，比较相等除了要比较equals方法以外，还需要比较hashCode是否相等，所以两个方法都必须重写，
 * 根据规则定义，equals相等，则hashCode必须相等，而hashCode相等的对象，不一定equals(即两个对象不相等)
 * 在HashMap HashSet中,hashCode()是判断放进容器里的两个对象是否相等的依据。如果自己写容器，那就修改覆写改方法
 * 1、如果两个对象相同，那么它们的hashCode值一定要相同；
 * 2、如果两个对象的hashCode相同，它们并不一定相同
 * 上面说的对象相同指的是用eqauls方法比较。
 * 是为了快速的验证两个对象是否相等。如果两个对象的hashcode不等，这两个对象就不等，如果hashcode相等，再进一步比较equals方法。
 */

import java.util.*;

public class QuSame {

    public static void main(String[] args) {
        List<Student> stu = new ArrayList<Student>();
        stu.add(new Student("1", "yi"));
        stu.add(new Student("3", "san"));
        stu.add(new Student("3", "san"));
        stu.add(new Student("2", "er"));
        stu.add(new Student("2", "er"));
        //set集合保存的是引用不同地址的对象
        Set<Student> ts = new HashSet<Student>();
        ts.addAll(stu);

        for (Student student : ts) {
            System.out.println(student.getId() + "-" + student.getName());
        }

        //Look
        HashSet set = new HashSet();
        set.add(new Student("test", "test"));
        /**
         * for (Entry<K,V> e = table[i]; e != null; e = e.next) {
         Object k;
         if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
         V oldValue = e.value;
         e.value = value;
         e.recordAccess(this);
         return oldValue;
         }
         }

         modCount++;
         addEntry(hash, key, value, i);
         return null;
         */
    }
}

