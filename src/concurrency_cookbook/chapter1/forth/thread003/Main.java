package concurrency_cookbook.chapter1.forth.thread003;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        FileSearch search=new FileSearch("src","Main.java");
        Thread thread =new Thread(search);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
