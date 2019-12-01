package concurrency_cookbook.one;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] trees) {
        Thread[] threads = new Thread[10];
        Thread.State[] status = new Thread.State[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Calculator(i));
            if (i % 2 == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread: " + i*10);

        }

        File path=new File("src/concurrency_cookbook/one/log.txt");
        try (FileWriter file = new FileWriter(path,true); PrintWriter pw = new PrintWriter(file)) {
            if (!path.exists()& path.canWrite()){
                path.createNewFile();
            }
            for (int i = 0; i < 10; i++) {
                pw.println("Main: Status of thread " + i + ": " + threads[i].getState());
                status[i] = threads[i].getState();
            }

            for (int i = 0; i < 10; i++) {
                threads[i].start();
            }

            boolean finish = false;
            while (!finish) {
                for (int i = 0; i < 10; i++) {
                    if (threads[i].getState() != status[i]) {
                        writeThreadInfo(pw, threads[i], status[i]);
                        status[i] = threads[i].getState();
                    }
                }
                finish = true;
                for (int i = 0; i < 10; i++) {
                    finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writeThreadInfo(PrintWriter pw, Thread thread, Thread.State state) {
        pw.printf("Main: ID %d - %s\n", thread.getId(), thread.getName());
        pw.printf("Main: Priority %d\n", thread.getPriority());
        pw.printf("Main: Old State %s\n", state);
        pw.printf("Main: New State %s\n", thread.getState());
        pw.printf("Main: ********************************\n");
    }
}
