package com.anteoy.decisiveBattle.structure.proxy;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public class ProxyImage implements Image {

    public String fileName;

    public RealImage realImage;

    ProxyImage(String fileName) {
        this.fileName = fileName;
        realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        realImage.display();
    }
}
