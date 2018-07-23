package com.anteoy.decisiveBattle.created.prototype;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public abstract class Shape implements Cloneable {
    private String id;
    public String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object objects = null;
        try {
            objects = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }
}
