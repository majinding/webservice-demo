package cn.majingjing.tm.concurrent;

import java.util.concurrent.Semaphore;

/**
 * <pre>
 * 信号量就是可以声明多把锁（包括一把锁：此时为互斥信号量）
 * 只有持有锁时才能继续执行
 * </pre>
 */
public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);//信号量控制的线程数量为3
        for (int i = 0; i < 10; i++) {
            new SemaphoreThreadDemo("thread-" + i, semaphore).start();
        }
        System.out.println("thread-" + Thread.currentThread().getName() + " go on ...");
    }


    static class SemaphoreThreadDemo extends Thread {
        private Semaphore semaphore;

        public SemaphoreThreadDemo(String name, Semaphore semaphore) {
            super(name);
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();//获取信号量，信号量内部计数器减1
                System.out.println(Thread.currentThread().getName() + " is start running...");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is end running...");
                semaphore.release();//释放信号量，信号量内部计数器加1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
