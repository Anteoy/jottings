package com.anteoy.sample;

/**
 * Created by zhoudazhuang
 * Date: 16-11-15
 * Time: 下午9:02
 * Description :
 */
public class Student {

    public String id;
    public String name;
    public Student() {
    }
    public Student(String id,String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        Student s=(Student)obj;
        return id.equals(s.id) && name.equals(s.name);
    }
    @Override
    public int hashCode() {
        String in = id + name;
        return in.hashCode();
    }
}

