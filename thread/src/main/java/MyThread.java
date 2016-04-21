import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class MyThread implements Runnable {
    public static AtomicLong count = new AtomicLong(0);

    public void run() {
        for (int i = 0; i < 100000000; i++) {
            //MyThread.count.();
        }

    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                Thread thread = new Thread(new MyThread());
                thread.start();
                thread.join();
            }
            System.out.println(MyThread.count);
        } catch (Exception e) {

        }


    }
}