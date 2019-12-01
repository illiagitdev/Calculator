package concurrency_cookbook.chapter1.forth.thread005;

import java.util.Date;
import java.util.Deque;

public class CleanerTask extends Thread {
    private Deque<Event> deque;

    public CleanerTask(Deque<Event> deque) {
        this.deque = deque;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            Date date = new Date();
            clean(date);
        }
    }

    public void clean(Date date) {
        long difference;
        boolean delate;

        if (deque.size() == 0) {
            return;
        }
        delate = false;
        do {
            Event e = deque.getLast();
            difference = date.getTime() - e.getDate().getTime();
            if (difference > 10000) {
                System.out.printf("Cleaner: %s\n", e.getEvent());
                deque.removeLast();
                delate = true;
            }
        } while (difference > 10000);
        if (delate){
            System.out.printf("Cleaner: size of the queue: %d\n",deque.size());
        }

    }
}

