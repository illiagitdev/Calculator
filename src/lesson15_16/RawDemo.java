package lesson15_16;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);

        Gen<String> sob = new Gen<>("some str");

        Gen raw = new Gen(new Double(2.42));

        Double d = (Double) raw.getOb();
        System.out.println("value d = "+d);

//        int i =(Integer)raw.getOb();

        sob=raw;

//        String str=sob.getOb();

        raw=iob;
//        d=(Double)raw.getOb();
    }
}

class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

