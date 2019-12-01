package concurrency_cookbook.chapter1.forth.thread007;

import java.util.concurrent.TimeUnit;

public class COre {
    public static void main(String[] args) {
        UnsafeTask task=new UnsafeTask();
        for (int i = 0; i < 5; i++) {
            Thread thread=new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
