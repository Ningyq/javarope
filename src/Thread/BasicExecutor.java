package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Coldwarm on 2018/8/9.
 */
public class BasicExecutor {
    public static void main(String[] args) {
        final int THREAD_NUMBER =3;
        final int LOOP_NUMBER =3;
        final int TASK_NUMBER =5;

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_NUMBER);

        for (int i = 0; i < TASK_NUMBER; i++) {
            SimpleTask task = new SimpleTask(i, LOOP_NUMBER);
            executor.submit(task);
        }
        executor.shutdownNow();
    }
}

class SimpleTask implements Runnable {
    private int id;
    private int counter;

    public SimpleTask(int id, int counter) {
        this.id = id;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < counter; i++) {
            System.out.println("Task #" + id + " running on " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task #" + id + " interrupted down");
//                e.printStackTrace();
                break;
            }
        }
    }
}