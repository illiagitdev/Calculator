package concurrency_cookbook.thread005;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Event> deque=new ArrayDeque<>();
        WrightTask wrightTask=new WrightTask(deque);
        for (int i = 0; i < 4; i++) {
            Thread thread=new Thread(wrightTask);
            thread.start();
        }
        CleanerTask cleanerTask=new CleanerTask(deque);
        cleanerTask.start();
    }
}
