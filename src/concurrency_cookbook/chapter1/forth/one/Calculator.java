package concurrency_cookbook.chapter1.forth.one;

import logger.LogType;
import logger.Logger;

public class Calculator implements Runnable {
    private int number;

    public Calculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s: %d *%d = %d\n", Thread.currentThread().getName(), number, i, i * number);
            Logger.INSTANCE.log(LogType.SYSTEM, Thread.currentThread().getName());
        }
    }
}
