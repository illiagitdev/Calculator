package lesson15_16;

public class Gen_Ierarchy<T> {
    T ob;

    public Gen_Ierarchy(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.println("Method getOb() from Gen_Ierarchy");
        return ob;
    }
}

class Gen2<T> extends Gen_Ierarchy<T> {

    public Gen2(T ob) {
        super(ob);
    }

    @Override
    public T getOb() {
        System.out.println("Method getOb() from Gen2");
        return ob;//super.getOb();
    }
}

class Gen3<T, V> extends Gen_Ierarchy<T> {
    V ob2;

    public Gen3(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }
}

class HierDemo {
    public static void main(String[] args) {
        Gen3<String, Integer> x = new Gen3<>("Value ", 23);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());


    }
}

class HierDemo3 {
    public static void main(String[] args) {
        Gen2<String> str = new Gen2<>("line");

        Gen2<Integer> x = new Gen2<>(23);
        Gen_Ierarchy<Integer> y = new Gen_Ierarchy<>(746);

        System.out.println(x.getOb());
        System.out.println(y.getOb());
        System.out.println(str.getOb());

        if (x instanceof Gen2<?>) {
            System.out.println("Object x is an example of Gen2");
        }
        if (x instanceof Gen_Ierarchy<?>) {
            System.out.println("Object x is an example of Gen_Ierarchy");
            System.out.println();
        }

        if (y instanceof Gen2<?>) {
            System.out.println("Object y is an example of Gen2");
        }
        if (y instanceof Gen_Ierarchy<?>) {
            System.out.println("Object y is an example of Gen_Ierarchy");
            System.out.println();
        }

        if (str instanceof Gen2<?>) {
            System.out.println("Object str is an example of Gen2");
        }
        if (str instanceof Gen_Ierarchy<?>) {
            System.out.println("Object str is an example of Gen_Ierarchy");
            System.out.println();
        }

//        if(y instanceof Gen2<Integer>){
//            System.out.println("Object y is an example of Gen2");
//        }

//        (Gen_Ierarchy<Integer>) x;          // ???
//        (Gen_Ierarchy<Long>) x;

    }
}
