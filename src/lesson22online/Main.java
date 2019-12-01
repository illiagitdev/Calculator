package lesson22online;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
//todo
//lidlock
//deadLock
//AtomicBoolean
//Runnable
//Callable
//FutureTask

public class Main {
    public static void main(String[] args) {
//        System.out.println(Const.MAP.get(2));
//
//        AtomicBoolean aBoolean = new AtomicBoolean();
//        aBoolean.get();
//        aBoolean.set(true);

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        Callable<Integer> task2 =()->{
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }catch (InterruptedException e){
                //throw new  InterruptedException("interrupted exeption", e.printStackTrace());
                e.printStackTrace();
            }
        };

//        Thread thread=new Thread(task);
//        thread.start();

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(task);
        Future<>
        try {
            System.out.println("try too shutdown");
            service.shutdown();
            service.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (!service.isTerminated()){
                System.err.println("cancel non-finished task");
            }
            service.shutdownNow();
            System.out.println("forsed shutdown now");
        }

        System.out.println("Done!");
    }


    public static void copyList(List<? extends Person> src, List<? super Person> dst) {
        dst.addAll(src);
    }
}
