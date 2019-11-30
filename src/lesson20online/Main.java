package lesson20online;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Main {
    /*

            1 - потоки
            2 -
     */
    public static String constant = "foo-foo";
    public static long i=0;

    public static void main(String[] args) {
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("first");
//                }
//            }
//        };
//        thread.setDaemon(true);
//        thread.start();
//
//        thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("main");
//
//                }
//            }
//        });
//        thread.start();

//        new Thread() {
//            @Override
//            public void run() {
//                new Main().show("first");
//            }
//        }.start();
//
//        new Main().show("main");

        TimerTask task =new TimerTask() {
            @Override
            public void run() {
                if(i++==50){
                    cancel();
                }
                System.out.println("Timer take it");
            }
        };

        Timer timer =new Timer();

        timer.schedule(task,0,5000);

        task.cancel();

        timer.purge();

        int j=5;
        new Thread() {
            @Override
            public void run() {
                System.out.println(j);
            }
        }.start();
//        j=7;

    }

    public void show(String str) {
        synchronized (constant) {// по поточному екземпляру обєкта/змінній буде сихронно працювати
            for (int i = 0; i < 1000; i++) {

                System.out.println(str);
            }
            try {
//                Thread.sleep(4000);
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    class MyThread extends Thread{
//        @Override
//        public void run() {
//            super.run();
//        }
//    }
}
