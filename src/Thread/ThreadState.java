package Thread;

public class ThreadState implements Runnable {
    public synchronized void waitForASecond() throws InterruptedException {
        wait(500);    // 使线程等待0.5秒或其它线程调用notify()或notifyAll()方法
    }

    public synchronized void waitForYears() throws InterruptedException {
        wait();      // 使线程永久等待，直到线程调用notify()或notifyAll()方法
    }

    public synchronized void notifyNow() throws InterruptedException {
        notify();          // 唤醒由调用wait()方法进入等待状态的线程
    }

    public void run() {
        try {
            waitForASecond();       // 在新进程中运行waitForASecond()方法
            waitForYears();         // 在新进程中运行waitForYears()方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
