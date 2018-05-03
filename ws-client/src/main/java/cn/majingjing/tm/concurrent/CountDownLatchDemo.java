package cn.majingjing.tm.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * <pre>
 * CountDownLatch可以理解为一个计数器
 * 当一个线程需要等待某些操作先完成时，需要调用await()方法。这个方法让线程进入休眠状态直到等待的所有线程都执行完成。
 * 每调用一次countDown()方法内部计数器减1,直到计数器为0时唤醒。
 * </pre>
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);//初始化count数目的同步计数器，只有当同步计数器为0，主线程才会向下执行
        for (int i = 0; i < 3; i++) {
            new CountDownLatchThreadDemo("线程" + i, countDownLatch).start();
        }
        System.out.println("waiting for all thread to finish...");
        try {
            countDownLatch.await();//等待当前线程等待计数器为0
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " go on ...");
    }

    static class CountDownLatchThreadDemo extends Thread {

        private CountDownLatch countDownLatch;

        public CountDownLatchThreadDemo(String name, CountDownLatch countDownLatch) {
            super(name);
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is start running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is end running...");
            this.countDownLatch.countDown();//计数器减1
        }

    }
}

