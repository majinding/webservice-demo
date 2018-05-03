package cn.majingjing.tm.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <pre>
 * CyclicBarrier允许两个或者多个线程在某个集合点同步。
 * 当一个线程到达集合点时，它将调用await()方法等待其它的线程。
 * 线程调用await()方法后，CyclicBarrier将阻塞这个线程并将它置入休眠状态等待其它线程的到来。
 * 等最后一个线程调用await()方法时，CyclicBarrier将唤醒所有等待的线程然后这些线程将继续执行。
 * CyclicBarrier可以传入另一个Runnable对象作为初始化参数。当最后一个线程到达集合点后，由最后一个进入的线程执行执行。
 * </pre>
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        //创建一个新的 CyclicBarrier ，当给定数量的线程（线程）等待它时，它将跳闸，并且当屏障跳闸时不执行预定义的动作。
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        //创建一个新的 CyclicBarrier ，当给定数量的线程（线程）等待时，它将跳闸，当屏障跳闸时执行给定的屏障动作，由最后一个进入屏障的线程执行。
//        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread-" + Thread.currentThread().getName() + " do [Runnable]");
//            }
//        });


        for (int i = 0; i < 3; i++) {
            new CyclicBarrierThreadDemo("thread-" + i, cyclicBarrier).start();
        }
        System.out.println("thread-" + Thread.currentThread().getName() + " go on ...");
    }

    static class CyclicBarrierThreadDemo extends Thread {
        private CyclicBarrier cyclicBarrier;

        public CyclicBarrierThreadDemo(String name, CyclicBarrier cyclicBarrier) {
            super(name);
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " start running...");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " start running... (do sth...)");

                //等待所有 parties已经在这个障碍上调用了 await
                //如果当前线程不是最后一个线程，那么它被禁用以进行线程调度，并且处于休眠状态
                this.cyclicBarrier.await();

                //所有线程都已经到达了集合点，当前线程允许其他线程继续之前运行该动作。

            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " end running...");

        }
    }
}
