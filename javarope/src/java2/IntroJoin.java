package java2;

public class IntroJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(new IntroRunnable(),"t1");
        Thread t2 = new Thread(new IntroRunnable(),"t2");
        Thread t3 = new Thread(new IntroRunnable(),"t3");

        t1.start();
        try {
            t1.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        try {
            t3.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
