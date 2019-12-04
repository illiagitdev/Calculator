package threadExamples.thread_control;


import static threadExamples.Utils.print;

public class Sample2_GetCurrentThread {

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            print(thread.getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        Thread main = Thread.currentThread();
        print(main.getName());
        thread1.start();
        thread2.start();
    }

}
