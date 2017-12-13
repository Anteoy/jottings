package com.anteoy.decisiveBattle.structure.flyweight;

import java.util.HashMap;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class ShapeFactory {
    public HashMap<String,Shape> hashMap = new HashMap();

    public Shape getCircle(String color){
        if (null == hashMap.get(color)){
            Shape shape = new Circle(color);
            hashMap.put(color,shape);
            System.out.println("缓存池不存在,返回新对象");
            return shape;
        }else{
            System.out.println("缓存池存在,返回缓存对象");
            return hashMap.get(color);
        }
    }
}
