package threadExamples.homies.task4;

import java.util.concurrent.TimeUnit;

public class Counter {
    private Storage storage = new Storage();
    private Printer printer = new Printer();

    public void run() {

        new Thread(() -> {
            int result=0;
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                result=storage.getValue();
                storage.setValue(++result);
                System.out.println("value");
                printer.print(result);


            }
        }).start();
    }
}
