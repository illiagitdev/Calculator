package lesson15_16.o9_collections_generics;

import java.util.*;

public class Operational {
    List<Student> listSs = new ArrayList<>();
    Set<Student> set1 = new HashSet<>();
    Set<Student> set2 = new HashSet<>();

    {
        Student[] st1 = new Student[11];
        st1[0] = new Student("Dreyk", 3);
        st1[1] = new Student("Maks", 3);
        st1[2] = new Student("Jane", 2);
        st1[3] = new Student("Joy", 2);
        st1[4] = new Student("Matt", 1);
        st1[5] = new Student("Jimm", 4);
        st1[6] = new Student("Bob", 1);
        st1[7] = new Student("Ann", 5);
        st1[8] = new Student("Alice", 2);
        st1[9] = new Student("Anet", 4);
        st1[10] = new Student("Mark", 1);
        listSs.addAll(Arrays.asList(st1));
        set1.addAll(Arrays.asList(st1));

        // cross list
        Student[] st2 = new Student[11];
        st2[0] = new Student("Fill", 5);
        st2[1] = new Student("Mary", 4);
        st2[2] = new Student("Jane", 2);
        st2[3] = new Student("Jonn", 1);
        st2[4] = new Student("Matt", 1);
        st2[5] = new Student("Jimm", 4);
        st2[6] = new Student("Bobby", 1);
        st2[7] = new Student("Ann", 5);
        st2[8] = new Student("Alice", 2);
        st2[9] = new Student("Anette", 1);
        st2[10] = new Student("Mark", 1);
        set2.addAll(Arrays.asList(st2));
    }

    public void run() {
        printStudent(listSs, 1);
        printCollection(set1);
        printCollection(set2);
        Set<Student> res;
        res=union(set1,set2);
        printCollection(res);

        res = intersect(set1, set2);
        printCollection(res);
    }

    public static Set<Student> union(Set<Student> set1, Set<Student> set2) {
        Set<Student> set = new HashSet<Student>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }

    public static Set<Student> intersect(Set<Student> set1, Set<Student> set2) {
        Set<Student> set = new HashSet<>();
        for (Student z1 : set1) {
            for (Student z2 : set2) {
                if (z1.getName() == z2.getName() && z1.getCourse() == z2.getCourse()) {
                    set.add(z1);
                }
            }
        }
        return set;
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

    static void printCollection(Collection collection) {
        for (Object element : collection)
            System.out.print(element + "\n");
        System.out.println();
    }
}
