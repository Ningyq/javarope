package java2;

/**
 * Created by Coldwarm on 2018/8/8.
 */
public class Synchronized1 {
    public static void main(String[] args) throws InterruptedException {
        ComputingThread ct = new ComputingThread();

        Thread t1 = new Thread(ct, "t1");
        Thread t2 = new Thread(ct, "t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count: " + ct.getCount());
    }
}

class ComputingThread implements Runnable {
    private int count;
    private final Object mutex = new Object();

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            processing(i);
            synchronized (mutex) {
                count ++;
                System.out.println(Thread.currentThread().getName() + " processing " + i + "  After Count:" + count);
            }
        }
    }

    public int getCount() {
        return count;
    }

    private void processing(int i) {
        System.out.println(Thread.currentThread().getName() + " processing " + i + "  Before Count:" + count);
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
