package lesson20online;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Parking {
    private static final boolean[] PARKING_PLACES = new boolean[5];
    private static final Semaphore SEMAPHORE = new Semaphore(5, true);

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
         new Thread(new Car(i)).start();
        }
    }

    public static class Car implements Runnable {
        private int carNumber;

        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            System.out.println("car with number " + carNumber + " arrived");

            try {

                SEMAPHORE.acquire();
                int parkingNumber = -1;
                synchronized (PARKING_PLACES) {
                    for (int i = 0; i < 5; i++) {
                        if (!PARKING_PLACES[i]) {
                            PARKING_PLACES[i] = true;
                            parkingNumber = i;
                            System.out.println("car with number " + carNumber + " took place: " + parkingNumber);
                            break;
                        }
                    }
                }

                TimeUnit.SECONDS.sleep(5);

                synchronized (PARKING_PLACES) {
                    PARKING_PLACES[parkingNumber] = false;
                    SEMAPHORE.release();
                    System.out.println("car with number " + carNumber + " left place: " + parkingNumber);
                }
            } catch (InterruptedException e) {

            }
        }
    }
}
