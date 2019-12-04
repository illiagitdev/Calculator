package threadExamples.run_thread;


import static threadExamples.Utils.print;
import static threadExamples.Utils.sleepRandom;

public class Sample1_OverrideThreadRunMethod {

    static class MyThread extends Thread {

        private String message;

        public MyThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            while (true) {
                print(message);

                sleepRandom(2000);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread("I am the best!");
        Thread thread2 = new MyThread("No, I am the best!");

        thread1.start();
        thread2.start();
    }
}
