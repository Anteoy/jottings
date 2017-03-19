package com.anteoy.coreJava.concurrent.lock.MySingleton;

import java.io.*;

/**
 * Created by root on 17-3-19.
 */
public class SaveAndReadForSingleton {

    public static void main(String[] args) throws InterruptedException {
        MySingleton singleton = MySingleton.getInstance();

        File file = new File("/root/IdeaProjects/utf-8/jottings/src/main/java/com/anteoy/coreJava/concurrent/lock/MySingleton/MySingleton.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            fos.close();
            oos.close();
            System.out.println(singleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            MySingleton rSingleton = (MySingleton) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(rSingleton.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
