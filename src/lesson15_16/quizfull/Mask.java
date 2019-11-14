package lesson15_16.quizfull;

import java.util.ArrayList;
import java.util.List;

public class Mask {
    static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }

    public static Double sum(List<? extends Number> numList) {
        Double result = 0.0;
        for (Number num : numList) {
            result += num.doubleValue();
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);

//        List<?> numList = new ArrayList<Integer>();
//        numList = new ArrayList<String>();

        List<? extends Number> numList = new ArrayList<Integer>();
//        numList = new ArrayList<String>();
    }
}
