package threadExamples;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utils {
    public static void print(String str) {
        System.out.printf("%s\n", str);
    }

    public static void sleep(long sleep){
        try {
            TimeUnit.SECONDS.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepRandom(long sleep){
        Random random=new Random();
        try {
            TimeUnit.SECONDS.sleep(random.nextInt()*sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void someLogic(int value){

    }
}
