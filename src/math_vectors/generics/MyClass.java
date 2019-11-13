package math_vectors.generics;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        T v =vals[0];
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v)<0)v=vals[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v =vals[0];
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v)>0)v=vals[i];
        }
        return v;
    }
}
