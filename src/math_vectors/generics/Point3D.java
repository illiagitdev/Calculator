package math_vectors.generics;

public class Point3D<T> extends Point2D {
    T z;

    public Point3D(Object x, Object y, T z) {
        super(x, y);
        this.z = z;
    }

    public T getZ() {
        return z;
    }
}
