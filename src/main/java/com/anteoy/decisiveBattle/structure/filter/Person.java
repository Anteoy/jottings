package com.anteoy.decisiveBattle.structure.filter;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class Person {
    public String name;

    public String maritalStatus;

    public String gender;

    public String getGender() {
        return gender;
    }

    public Person(String name, String maritalStatus, String gender) {
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
