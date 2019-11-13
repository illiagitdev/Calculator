package math_vectors.generics;

public class Point4D<T> extends Point3D {
    T t;

    public Point4D(Object x, Object y, Object z, T t) {
        super(x, y, z);
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
