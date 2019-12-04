package threadExamples.thread_control;

import static threadExamples.Utils.print;
import static threadExamples.Utils.sleep;

public class Sample0_StartOrRun {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 10;
                while (--count > 0) {
                    print("Thread1");

                    sleep(10);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            int count = 10;
            while (--count > 0) {
                print("Thread2");

                sleep(10);
            }
        });


        print("Running 1");

//        thread1.run();
        thread1.start();

        print("Running 2");

//        thread2.run();
        thread2.start();

        print("Finish");
    }

}
