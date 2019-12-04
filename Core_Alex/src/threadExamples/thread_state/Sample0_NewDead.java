package threadExamples.thread_state;

import static threadExamples.Utils.print;
import static threadExamples.Utils.someLogic;

public class Sample0_NewDead {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int count = 10;
            while (--count > 0) {
                print("Running<->Runnable");

                someLogic(1000000);
            }
            print("Almost Dead");
        });

        print("New");

        thread.start();

        print("Runnable");

        thread.join();

        print("Dead");
    }

}
