package lesson20online;

import java.util.concurrent.TimeUnit;

public class Main2 {
    public static int i = 0;

    public static void main(String[] args) {
//        Main main=new Main();
//        Generator generator=new Generator(new DataReceiver<String>() {
//            @Override
//            public void onDataReceive(String data) {
//                main.show(data);
//            }
//        });
//        generator.start();

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        thread.interrupt();
        thread.isInterrupted();
    }

    public void show(String data) {
        System.out.println(++i + " Receive data: " + data);
    }
}
