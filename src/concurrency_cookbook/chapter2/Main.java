package concurrency_cookbook.chapter2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        service.submit(()->{
           String threadName=Thread.currentThread().getName();
            System.out.printf("Thread: %s\n",threadName);
        });

        try {
            System.out.printf("attempt to shutdown executor\n");
            service.shutdown();
            service.awaitTermination(5, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            System.err.println("task interrupted");
        }finally {
            if(!service.isTerminated()){
                System.err.println("cancel non-finished task");
            }
            service.shutdownNow();
            System.out.printf("shutdown done\n");
        }
    }

}