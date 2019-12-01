package concurrency_cookbook.chapter1.forth.thread007;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnsafeTask implements Runnable {
    private Date startDate;

    @Override
    public void run() {
        startDate=new Date();
        System.out.printf("Startind thread: %s : %s\n",Thread.currentThread().getId(),startDate);
        try {
            TimeUnit.SECONDS.sleep((long) Math.rint(Math.random()*10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread finished: %s : %s\n",Thread.currentThread().getId(),startDate);
    }
}
