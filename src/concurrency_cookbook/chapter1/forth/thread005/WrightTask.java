package concurrency_cookbook.chapter1.forth.thread005;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

public class WrightTask implements Runnable {
    private Deque<Event> deque;

    public WrightTask(Deque<Event> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Event event=new Event();
            event.setDate(new Date());
            event.setEvent(String.format("The thread %s has generated an event.", Thread.currentThread().getId()));
            deque.addFirst(event);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
