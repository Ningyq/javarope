package java2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadTimer extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task started at " + new Date());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Timer task ended at " + new Date());
    }

    public static void main(String[] args) throws InterruptedException {
        TimerTask task = new ThreadTimer();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(task,0,7*1000);
        System.out.println("Started");
        Thread.sleep(50000);
        timer.cancel();
    }
}
