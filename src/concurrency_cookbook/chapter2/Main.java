package concurrency_cookbook.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        service.submit(() -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.printf("Thread: %s\n", threadName);
//        });
//
//        try {
//            System.out.printf("attempt to shutdown executor\n");
//            service.shutdown();
//            service.awaitTermination(5, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            System.err.println("task interrupted");
//        } finally {
//            if (!service.isTerminated()) {
//                System.err.println("cancel non-finished task");
//            }
//            service.shutdownNow();
//            System.out.printf("shutdown done\n");
//        }

        //****************************************

//        Callable task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//                return 222;
//            } catch (InterruptedException e) {
//                throw new IllegalStateException("task interrupted", e);
//            }
//        };
//
//        ExecutorService executor=Executors.newFixedThreadPool(1);
//        Future<Integer> future=executor.submit(task);
//
//        System.out.println("Future is done? "+future.isDone());
//
//        try {
////            executor.shutdownNow();
//            Integer integer=future.get();
//            System.out.println("Future is done? "+future.isDone());
//            System.out.println("result "+integer);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        //************************

//        ExecutorService executor = Executors.newFixedThreadPool(1);
//        Future<Integer> future = executor.submit(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(2);
//                return 444;
//            } catch (InterruptedException e) {
//                throw new IllegalStateException("task interrupted", e);
//            }
//        });
//
//        System.out.println("Future is done? " + future.isDone());
//
//        try {
////            executor.shutdownNow();
//            Integer integer = future.get(1,TimeUnit.SECONDS);
//            System.out.println("Future is done? " + future.isDone());
//            System.out.println("result " + integer);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        }


        //******************************************

//        ExecutorService executor=Executors.newWorkStealingPool();
//
//        List<Callable<String>> callables= Arrays.asList(
//                ()->"task - 1",
//                ()->"task - 2",
//                ()->"task - 3"
//        );
//
////        Future<String > future;
//        executor.invokeAll(callables).
//                stream().map(future-> {
//                    try {
//                        return future.get();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    }
//            return null;
//        }).forEach(System.out::println);

//****************************************

    }

//    Callable callable(String result, long sleepSeconds) {
//        return->{
//            try {
//                TimeUnit.SECONDS.sleep(sleepSeconds);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return sesult;
//        }
//    }

}