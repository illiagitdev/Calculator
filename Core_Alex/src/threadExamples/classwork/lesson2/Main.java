package threadExamples.classwork.lesson2;

import java.util.Random;

//todo: set(), compareAndSet()  перевірити як робитиме в багатопоточності
public class Main {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(23);
        intStack.push(324);
        intStack.push(3214);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());

        /*with set() & get() AtomicReference*/
        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int tmp = random();
                System.out.printf("%s push value %d , \t\tsize- %s\n", Thread.currentThread().getName(), tmp, intStack.size());
                intStack.push(tmp);
                System.out.printf("%s push unknown %s, \t\tsize- %s\n", Thread.currentThread().getName(), tmp, intStack.size());
                intStack.push(random());
                System.out.printf("%s from -> %s\n",intStack.toString(),Thread.currentThread().getName(), intStack.size());
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
                System.out.printf("%s pop() element %d , \t\tsize- %s\n", Thread.currentThread().getName(), intStack.pop(), intStack.size());
                System.out.printf("%s pop() element %d ,\t\t size- %s\n", Thread.currentThread().getName(), intStack.pop(), intStack.size());
                System.out.printf("%s from -> %s\n",intStack.toString(),Thread.currentThread().getName(), intStack.size());
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
                System.out.printf("%s push value %d , \t\tsize- %s\n", Thread.currentThread().getName(), tmp, intStack.size());
                intStack.push(tmp);
                System.out.printf("%s pop() element %d , \t\tsize- %s\n", Thread.currentThread().getName(), intStack.pop(), intStack.size());
                System.out.printf("%s push unknown , \t\tsize- %s\n", Thread.currentThread().getName(), intStack.size());
                intStack.push(random());
                System.out.printf("%s from -> %s\n",intStack.toString(),Thread.currentThread().getName(), intStack.size());
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
