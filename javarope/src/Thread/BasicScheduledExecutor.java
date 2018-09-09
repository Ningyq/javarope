package Thread;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BasicScheduledExecutor {
    private static final int SCHEDULED_POOL_SIZE = 3;

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(SCHEDULED_POOL_SIZE);

        ScheduledTask task1 = new ScheduledTask(1);
        ScheduledTask task2 = new ScheduledTask(2);

//               scheduledExecutor.scheduleAtFixedRate(task1,0,10, TimeUnit.SECONDS);
        scheduledExecutor.scheduleWithFixedDelay(task1,0,10, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(13);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutor.shutdown();
    }
}

class ScheduledTask implements Runnable {
    private int id;

    public ScheduledTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task #" + id + " running at "+ LocalDateTime.now());
    }
}