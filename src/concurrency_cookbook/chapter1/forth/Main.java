package concurrency_cookbook.chapter1.forth;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        FileClock fileClock = new FileClock();
        Thread thread = new Thread(fileClock);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
