package concurrency_cookbook.chapter1.forth.thread009;

public class MAin {
    public static void main(String[] args) {
        MyThreadGroup myThreadGroup = new MyThreadGroup("THread group");
        Task task = new Task();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(myThreadGroup, task);
            thread.start();
        }
    }
}
