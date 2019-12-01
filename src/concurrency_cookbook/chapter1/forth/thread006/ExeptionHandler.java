package concurrency_cookbook.thread005;

public class ExeptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("An exeption has been captured.\n");
        System.out.printf("Thread: %s\n", t.getId());
        System.out.printf("Exeption: %s: %s\n", e.getClass().getName(), e.getMessage());
        System.out.printf("Stack trace:\n");
        e.printStackTrace(System.out);
        System.out.printf("Thread status: %s\n", t.getState());
    }
}
