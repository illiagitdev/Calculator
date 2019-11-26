package lesson15_16.o9_collections_generics;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operational student = new Operational();
//        student.run();

        student.runTester(6000);

        for (Method m : PerformanceChecker.class.getMethods()) {
            System.out.println(m.toGenericString());
        }

        for (Method m : PerformanceChecker.class.getMethods()) {
            System.out.println(m.toGenericString());
        }

        System.out.println();
        for (Method m : Point.class.getMethods()) {
            if (m.getName().equals("clone"))
                System.out.println(m.toGenericString());
        }

        PerformanceChecker test=new PerformanceChecker();
        System.out.println("number = "+test.getNumber());

        try {
            Field m;
            for (Field z : PerformanceChecker.class.getFields()) {
                System.out.println(z.toGenericString());
            }
            m=PerformanceChecker.class.getDeclaredField("number");
            m.setInt(5,5);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("2-number = "+test.getNumber());

        List<Integer> ints=new ArrayList<>();
        List<String> strs=new ArrayList<>();
        assert ints.getClass()==strs.getClass();
        assert ints.getClass()==ArrayList.class;

    }
}
