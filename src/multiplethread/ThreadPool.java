package multiplethread;

import java.util.LinkedList;

public class ThreadPool {
    int threadPoolSize;
    LinkedList<Runnable> tasks = new LinkedList<>();

    public ThreadPool() {
        threadPoolSize = 10;
        synchronized (tasks) {
            for (int i = 1; i <= threadPoolSize; i++) {
                new TaskConsumeTread("任务消费者线程 " + i).start();
            }
        }
    }

    public void add(Runnable r) {
        synchronized (tasks) {
            tasks.add(r);
            tasks.notifyAll();
        }
    }

    class TaskConsumeTread extends Thread {
        public TaskConsumeTread(String name) {
            super(name);
        }

        Runnable task;

        public void run() {
            System.out.println("启动： " + this.getName());
            while (true) {
                synchronized (tasks) {
                    while (tasks.isEmpty()){
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = tasks.removeLast();
                    tasks.notifyAll();
                }
                System.out.println(this.getName() + " 获取到任务，并执行");
                task.run();
            }
        }
    }

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool();
        for (int i = 0; i < 5; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行任务");
                }
            };

            pool.add(task);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
