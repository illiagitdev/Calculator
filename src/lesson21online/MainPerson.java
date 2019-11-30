package lesson21online;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        List<Persom> persoms = new ArrayList<>();
        persoms.add(new Persom("WW", (byte) 4));
        persoms.add(new Persom("WrW", (byte) 42));
        persoms.add(new Persom("WweW", (byte) 34));
        persoms.add(new Persom("WfwW", (byte) 12));
        persoms.add(new Persom("WgfdW", (byte) 43));
        persoms.add(new Persom("WjgW", (byte) 42));


//        System.out.println(persoms.toString());

//        for (Persom x:persoms
//             ) {
//            System.out.println(x.toString());
//        }

        persoms.stream().filter(persom -> persom.age >= 18).sorted(Comparator.comparingInt(o->o.age)).map(persom -> persom.age).forEach(System.out::println);

        System.out.println(persoms.stream().
                filter(persom -> persom.age >= 18).
                sorted(Comparator.comparingInt(o->o.age)).
                mapToInt(persom -> persom.age).
                average().getAsDouble());

    }
}
