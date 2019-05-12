package com.anteoy.race;

/**
 * Created by zhoudazhuang on 19-5-12.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 考察Future CountDownLatch CyclicBarrier Executors使用
 * 运动会上百米赛跑的项目
 * 1、等待所有的运动员准备就绪
 * 2、裁判的发令枪响
 * 3、运动员使出洪荒之力开始奔跑
 * 4、等待最后一名运单员跑至终点并公布所有运动员的成绩
 */
public class Running {
    public static void main(String[] args) {
        int amout = 8;
        CountDownLatch count = new CountDownLatch(amout);
        CountDownLatch begin = new CountDownLatch(1);
        /**
         * 发令员裁判的角色
         */
        CyclicBarrier cyclicBarrier = new CyclicBarrier(amout, new Runnable() {
            @Override
            public void run() {
                System.out.println("所有运动员已经准备就绪 ，发令枪响...");
            }
        });
        ExecutorService exc = Executors.newCachedThreadPool();
        List<Future<Runner>> list = new ArrayList<Future<Runner>>();
        System.out.println("百米赛跑即将开始，请所有运动员马上准备");
        for (int i = 1; i < amout+1 ; i++) {
            Runner runner = new Runner(cyclicBarrier,begin,count,i + "号运动员");
            Future<Runner> future = exc.submit(runner);
            list.add(future);
        }
        try {
            begin.countDown();
            count.await();
            exc.shutdown();
            System.out.println("赛跑结束.公布成绩");
            for (Future<Runner> future : list) {
                Runner runner = future.get();
                System.out.println(runner.getName()+"成绩是：" +runner.getGrade());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class Runner implements Callable<Runner> {
    private CountDownLatch begin;
    private CountDownLatch count;
    private CyclicBarrier cyclicBarrier;
    private String name;
    private Integer grade;
    public String getName() {
        return name;
    }
    public Integer getGrade() {
        return grade;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Runner(CyclicBarrier cyclicBarrier,CountDownLatch begin,CountDownLatch count, String name) {
        this.cyclicBarrier=cyclicBarrier;
        this.begin=begin;
        this.count = count;
        this.name = name;
    }
    @Override
    public Runner call() throws Exception {
        try {
            System.out.println(this.name + " 已经就位准备起跑");
            begin.await();
            cyclicBarrier.await();
            System.out.println(this.name + "起跑");
            int nextInt = new Random().nextInt(9000);
            Thread.sleep(nextInt);
            System.out.println(this.name + " 跑到终点了");
            this.setGrade(nextInt);
            count.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        return this;
    }



}
