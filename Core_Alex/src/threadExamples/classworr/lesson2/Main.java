package threadExamples.classworr.lesson2;

import java.util.Random;

//todo: set(), compareAndSet()  перевірити як робитиме в багатопоточності
public class Main {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();
//        intStack.push(23);
//        intStack.push(324);
//        intStack.push(3214);
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());

        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int tmp = random();
                System.out.printf("%s push value %d\n", Thread.currentThread().getName(), tmp);
                intStack.push(tmp);
                System.out.printf("%s push unknown\n", Thread.currentThread().getName(), tmp);
                intStack.push(random());
            }
        });
        thread1.setName("Thread 1:");
        thread1.start();

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int tmp = random();
                System.out.printf("%s pop() element %d\n", Thread.currentThread().getName(), intStack.pop());
                System.out.printf("%s pop() element %d\n", Thread.currentThread().getName(), intStack.pop());
            }
        });
        thread2.setName("Thread 2:");
        thread2.start();

        Thread thread3 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int tmp = random();
                System.out.printf("%s push value %d\n", Thread.currentThread().getName(), tmp);
                intStack.push(tmp);
                System.out.printf("%s pop() element %d\n", Thread.currentThread().getName(), intStack.pop());
                System.out.printf("%s push unknown\n", Thread.currentThread().getName(), tmp);
                intStack.push(random());
            }
        });
        thread3.setName("Thread 3:");
        thread3.start();
    }

    private static int random() {
        Random random = new Random();
        return (int) (random.nextDouble() * 10);
    }
}
