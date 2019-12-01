package lesson21online;

import lesson20online.DataReceiver;
import lesson20online.Generator;

import java.util.concurrent.TimeUnit;

public class Main {
    private static int i=0;

    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    Generator generator=new Generator(new DataReceiver<String>() {
                        @Override
                        public void onDataReceive(String data) {
                            System.out.println("metod data");
                        }
                    });
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        new  Main().show("main object");
//        thread.interrupt();/
        thread.isInterrupted();
    }

    public void show(String data) {
        System.out.println(++i + " Receive data: " + data);
    }
}

