package lesson15_16.quizfull;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Pair<T1, T2> {
    T1 object1;
    T2 object2;

    public Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    public T1 getObject1() {
        return object1;
    }

    public T2 getObject2() {
        return object2;
    }
}

class Test1 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(34, "age");
        System.out.println(pair.getObject1() + "  " + pair.getObject2());

//        List list = new LinkedList();
//        list.add("First");
//        list.add("Second");//10
//        List<String> list2 = list;
//        for(Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
//            System.out.println(itemItr.next());

        List<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second"); //10
        List list2 = list;
        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext(); )
            System.out.println(itemItr.next());
    }
}