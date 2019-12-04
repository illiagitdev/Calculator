package threadExamples.thread_state;

import java.util.Calendar;

import static threadExamples.Utils.print;
import static threadExamples.Utils.sleep;

public class Sample2_SleepingInterrupt {

    public static void main(String[] args) {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    print("Sleeping");
                    long time = now();
                    try {

                        Thread.sleep(10000);

                    } catch (InterruptedException e) {
                        print("Sleep interrupted: " + (now() - time) + "ms");
                    }
                    print("Running");
                }
            }
        });

        Thread interrupter = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    print("Try to interrupt..");

                    thread.interrupt();

                    sleep(1000);
                }
            }
        });

        thread.start();
        interrupter.start();
    }

    private static long now() {
        return Calendar.getInstance().getTimeInMillis();
    }

}
