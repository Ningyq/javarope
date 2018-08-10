package multiplethread;

import java.text.SimpleDateFormat;
import java.util.Date;



public class ThreadTest {

    public static String now() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    static final Object someObject = new Object();

    static class ThreadSome extends Thread {

        public void run() {
            try {
                System.out.println(now() + "  " + getName() + "线程已经运.");
                System.out.println(now() + "  " + this.getName() + "试图占有对象：someObject");
                synchronized (someObject) {
                    System.out.println(now() + "  " + this.getName() + "占有对象：someObject");
                    Thread.sleep(5000);
                    System.out.println(now() + "  " + this.getName() + "释放对象：someObject");
                }
                System.out.println(now() + "  " + getName() + "线程结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSome t1 = new ThreadSome();
        t1.setName("t1");
        t1.start();
        ThreadSome t2 = new ThreadSome();
        t2.setName("t2");
        t2.start();
    }
}
