package threadExamples.thread_control;

public class Sample1_StopThreadDeath {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            public void run() {
                try {
                    Thread.sleep(2500);
                } catch (Throwable ex) {
                    ex.printStackTrace();
                }
            }
        };
        thread.start();

        Thread.sleep(1000);
        thread.stop();
    }

}
