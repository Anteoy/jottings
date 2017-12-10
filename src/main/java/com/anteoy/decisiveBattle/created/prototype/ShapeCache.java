package com.anteoy.decisiveBattle.created.prototype;

import java.util.Hashtable;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public class ShapeCache {

    private static Hashtable<String ,Shape> shapMap = new Hashtable<>();


    public static void initData(){
        Shape shape = new Circle();
        shape.setId("1");
        shapMap.put(shape.getId(),shape);

        //可继续添加其他缓存 等待clone的对象类型
    }

    //return clone 对象
    public static Shape getShape(String  id){
        switch(id){
            case "1":
                return (Shape)shapMap.get(id).clone();
            //...
        }
        return null;
    }
}
