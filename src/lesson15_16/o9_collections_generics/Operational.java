package lesson15_16.o9_collections_generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Operational {
    List<Student> listSs;
    {
        Student st1 = new Student("Maks", 3);
        Student st2 = new Student("Jane", 2);
        Student st3 = new Student("Joy", 2);
        Student st4 = new Student("Matt", 1);
        Student st5 = new Student("Jimm", 4);
        Student st6 = new Student("Bob", 1);
        Student st7 = new Student("Ann", 5);
        Student st8 = new Student("Alice", 2);
        Student st9 = new Student("Anet", 4);
        Student st10 = new Student("Mark", 1);
        Student st11 = new Student("Dreyk", 3);
        listSs = new ArrayList<>();
        listSs.add(st1);
        listSs.add(st2);
        listSs.add(st3);
        listSs.add(st4);
        listSs.add(st5);
        listSs.add(st6);
        listSs.add(st7);
        listSs.add(st8);
        listSs.add(st9);
        listSs.add(st10);
        listSs.add(st11);
    }

    public void run(){
        printStudent(listSs, 1);
    }

     /*
*
* Задание 2
Напишите методы Set<Student> union(Set<Student> set1, Set<Student> set2) и Set<Student> intersect(Set<Student> set1,
* Set<Student> set2), реализующих операции объединения и пересечения двух множеств.

Union - вернуть Set который хранит все значения с обеих коллекций.
Intersect - вернуть Set который хранит только те значения которые есть одновременно в обоих коллекциях.

Протестируйте работу этих методах на двух предварительно заполненных множествах. (Вам понадобится написать
* вспомогательный метод, выводящий все элементы множества в консоль).
*/

     private <T extends List>void set(){

     }

    public static void printStudent(List<Student> list, int course) {
        Iterator<Student> iterator = list.iterator();
        Student tmp = new Student();
        while (iterator.hasNext()) {
            tmp = iterator.next();
            if (course == tmp.getCourse()) {
                System.out.println(tmp.getName());
            }
        }
    }

}
