package java2;

public class IntroRunnable implements Runnable{

    public void run() {
        System.out.println("THREAD START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            Processing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("THREAD END "+Thread.currentThread().getName());
    }

    private void Processing() {
        System.out.println("Processing......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new IntroRunnable(),"imthread1");
        Thread t2 = new Thread(new IntroRunnable(),"imthread2");
        t1.start();
        t2.start();
    }
}
