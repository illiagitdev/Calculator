package threadExamples.thread_state;


import static threadExamples.Utils.someLogic;

public class Sample1_RunnableRunning {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.print("+");
                    someLogic(1_000_000);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("");
                    someLogic(10_000_000);
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
