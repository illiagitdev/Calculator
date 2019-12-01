package concurrency_cookbook.chapter1.forth.thread004;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Begin data source loading NetworkConnectionLoader: %s\n", new Date());

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("End data source loading NetworkConnectionLoader: %s\n", new Date());
    }
}
