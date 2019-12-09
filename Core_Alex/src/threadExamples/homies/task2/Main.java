package threadExamples.homies.task2;

import java.util.LinkedList;
import java.util.List;

/*Задача №2
        Написать многопоточную программу в которой будет создаваться список (LinkedList or ArrayList) и при выполнении
        программы будет падать ошибка ConcurrentModificationException.
        A/C:
        1. Потоков должно быть несколько
        2. В main методе должны быть методы работы со списком, а не сама логика (то что мы обсуждали про вынесение в
        отдельные методы логики) */
public class Main {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        System.out.println("Creation of runnable!");
        Runnable task1=new ListModifier<>(list,"some text");
        Runnable task2=new ListModifier<>(list,"some new text");
        Runnable task3=new ListModifier<>(list,"last text");
        System.out.println("Naw creating threads");
        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        Thread thread3=new Thread(task3);
        System.out.println("Starting all tasks");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("End!");
    }
}
