package java2;

/**
 * Created by Coldwarm on 2018/8/4.
 */
public class BasicDaemonThread {

    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThread(),"dt");
        dt.setDaemon(true);
        dt.start();

        Thread.sleep(5000);

        System.out.println("Alldone");
    }
}

class DaemonThread implements Runnable {

    @Override
    public void run() {
        while (true){
            try {
                Processing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void Processing() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("daemon thread running...");
    }
}