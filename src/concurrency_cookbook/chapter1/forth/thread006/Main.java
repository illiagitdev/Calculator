package concurrency_cookbook.chapter1.forth.thread006;

public class Main {
    public static void main(String[] args) {
        Task task= new Task();
        Thread thread=new Thread(task);
        thread.setUncaughtExceptionHandler(new ExeptionHandler());
        thread.start();
    }
}
