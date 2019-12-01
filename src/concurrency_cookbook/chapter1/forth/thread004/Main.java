package concurrency_cookbook.chapter1.forth.thread004;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DataSourceLoader loader = new DataSourceLoader();
        Thread thread1 = new Thread(loader, "DataSourceLoader");

        NetworkConnectionLoader connectionLoader = new NetworkConnectionLoader();
        Thread thread2 = new Thread(connectionLoader, "NetworkConnectionLoader");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Configuration has been loaded: %s\n", new Date());
    }
}
