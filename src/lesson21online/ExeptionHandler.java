package lesson21online;

public class ExeptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("exeption handler");
    }
}
