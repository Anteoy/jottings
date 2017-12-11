package com.anteoy.decisiveBattle.behavier.Observer;

/**
 * Created by zhoudazhuang on 17-12-11.
 */
public class TestMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();
        subject.addObserver(binaryObserver);
        subject.addObserver(octalObserver);
        subject.notifyAllObserver();
    }
}
