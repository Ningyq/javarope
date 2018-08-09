package java2;

public class DeadLockAna {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new Thread(new LockThread(obj1,obj2),"t1");
        Thread t2 = new Thread(new LockThread(obj2,obj3),"t2");
        Thread t3 = new Thread(new LockThread(obj3,obj1),"t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class LockThread implements Runnable {
    private Object obj1;
    private Object obj2;

    public LockThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " requiring lock on  " + obj1);
        synchronized (obj1) {
            System.out.println(name + " required lock on  " + obj1);

            System.out.println(name + " requiring lock on  " + obj2);
            synchronized (obj2) {
                System.out.println(name + " required lock on  " + obj2);
            }
            System.out.println(name + " released lock on  " + obj2);
        }
        System.out.println(name + " released lock on  " + obj1);
        System.out.println(name + " execution finished.");
    }
}