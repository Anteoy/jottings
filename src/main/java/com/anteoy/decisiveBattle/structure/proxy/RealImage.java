package com.anteoy.decisiveBattle.structure.proxy;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public class RealImage implements Image {
    public String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        //最开始我设计的时候没有加loadFromDisk
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("display ing:" + fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("loadFromDisk..." + fileName);
    }
}
