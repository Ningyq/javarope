package java2;

public class HelloRunnable implements Runnable{

    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}
