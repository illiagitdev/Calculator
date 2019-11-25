package lesson17_18.tasks;

import lesson17_18.tasks.task1.MyArrayClasses;
import lesson17_18.tasks.task1.MyArrayList;
import lesson17_18.tasks.task2.MyLinkedLink;
import lesson17_18.tasks.task2.MyLinkedListClasses;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<Integer> values=new MyArrayList<>(Integer.class,12);
//        values.add(123);
//        values.add(12);
//        values.add(23);
//        values.add(1263);
//        values.add(1243);
//
//        values.remove(3);
//        System.out.println(values.get(3));
//
//        MyLinkedLink<String> line=new MyLinkedLink<>();
//        line.add("first");
//        line.add("second");
//        line.add("third");
//        line.add("forth");

//        System.out.println(line.toString());


//        MyArrayClasses<String> MyArrayClasses;
//        MyArrayClasses = new MyArrayClasses<String>(String.class);
//        MyArrayClasses.add("Story1");
//        MyArrayClasses.add("Story2");
//        MyArrayClasses.add("Story3");
//        MyArrayClasses.remove(1);
//        for (int i = 0; i <MyArrayClasses.size() ; i++) {
//            System.out.println(MyArrayClasses.getIndex(i));
//        }

        MyLinkedListClasses<String> list = new MyLinkedListClasses<>();
        list.add("llll");
        System.out.println("add first");
        list.add("222");
        System.out.println("add fin");
        System.out.println(list.size());
        System.out.println(list.getIndex("222"));
        System.out.println(list.get(0));

    }
}
