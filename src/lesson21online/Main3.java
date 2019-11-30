package lesson21online;

public class Main3 {
    public static void main(String[] args) {
        ThreadGroup group=new ThreadGroup("Task thread.");
        System.out.println(group.getName());

        Task task = new Task();
        Thread thread=new Thread(group, task);
        thread.setUncaughtExceptionHandler(new ExeptionHandler());
        thread.setName("Task Thread lkz gthtlfxb lfyyb[");
        thread.start();
        thread.setPriority(10);
        Thread.currentThread().interrupt();

        System.out.println("still work");
    }
}
