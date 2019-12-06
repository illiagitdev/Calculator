package threadExamples.ome_samples;
/*
* Задача №2
  Написать многопоточную программу в которой будет создаваться список (LinkedList or ArrayList) и при выполнении
  программы будет падать ошибка ConcurrentModificationException.
A/C:
        1. Потоков должно быть несколько
         2. В main методе должны быть методы работы со списком, а не сама логика (то что мы обсуждали про вынесение в
          отдельные методы логики)

* */

public class Task2 {
    String name="sd";

    public synchronized void show() throws InterruptedException {
        System.out.printf("%s\n",name);
        name.wait();
    }
}
