package concurrency_cookbook.chapter1.forth.thread009;

public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("The Thread: %s thrown an exception\n", t.getId());
        e.printStackTrace(System.out);
        System.out.printf("Terminating the rest of threads\n");
        interrupt();
    }
}
