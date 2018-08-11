package multiplethread;

public class TestThread {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 =new Thread(){
            public void run() {
                int seconds = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("程序1已经运行" + seconds++ + "秒");
                }
            }
        };

        t1.setDaemon(true);
        t1.start();
    }
}
