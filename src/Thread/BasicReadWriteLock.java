package Thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BasicReadWriteLock {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    private Integer counter = 0;
    private Map<Integer, String> syncHashMap = new HashMap<>();

    public BasicReadWriteLock() {
        this.syncHashMap.put(0,"A");
        this.syncHashMap.put(1,"B");
        this.syncHashMap.put(2,"C");
        this.syncHashMap.put(3,"D");
        this.syncHashMap.put(4,"E");
        this.syncHashMap.put(5,"F");
        this.syncHashMap.put(6,"G");
    }

    public String get(Integer key) {
        try {
            System.out.println(Thread.currentThread().getName() + " 正在申请资源(readlock) " + syncHashMap.get(key));
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + " 已经申请到资源(readlock) " + syncHashMap.get(key));
            return syncHashMap.get(key);
        } finally {
            readLock.unlock();
            System.out.println(Thread.currentThread().getName() + " 已经释放资源(readlock) " + syncHashMap.get(key));
        }

    }

    public String remove(Integer key) {
        try {
            System.out.println(Thread.currentThread().getName() + " 正在申请资源(writelock) " + syncHashMap.get(key));
            writeLock.lock();
            System.out.println(Thread.currentThread().getName() + " 已经申请到资源(wrietlock) " + syncHashMap.get(key));
            return syncHashMap.remove(key);
        } finally {
            System.out.println(Thread.currentThread().getName() + " 已经释放资源(writelock) " + syncHashMap.get(key));
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(3);
        BasicReadWriteLock mutex = new BasicReadWriteLock();

        executor.execute(new Thread(new Reader(mutex),"Reader1"));
        executor.execute(new Thread(new Reader(mutex),"Reader2"));
        executor.execute(new Thread(new Reader(mutex),"Reader3"));

        executor.shutdown();
    }

    public static class Reader implements Runnable {
        private BasicReadWriteLock reader;

        public Reader(BasicReadWriteLock reader) {
            this.reader = reader;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is reading " + reader.get(i));
                reader.remove(i);
            }
        }
    }
}
