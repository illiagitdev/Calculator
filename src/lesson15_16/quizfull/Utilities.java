package lesson15_16.quizfull;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        System.out.println("List for work generic method: " + intList);
        Utilities.fill(intList, 0);
        System.out.println("List after job of generick method: " + intList);

//        List<Integer> list = new List<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
//        List<Number> list3 = new ArrayList<Integer>();
//        List<Integer> list4 = new ArrayList<Number>();
    }
}
