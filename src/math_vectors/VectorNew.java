package math_vectors;

public class VectorNew<T> {
    private T x;
    private T y;
    private T z;

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public T getZ() {
        return z;
    }

    /**
     * Creates vector with determined values
     *
     * @param x
     * @param y
     * @param z
     */
    public VectorNew(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Creates zero-vector
     */
    public VectorNew() {}

//    public VectorNew<T> addVectors(VectorNew<T> a, VectorNew<T> b) {
//        return new VectorNew<T>(a.x + b.x, a.y + b.y, a.z + b.z);
//    }
//
//    public VectorNew<T> dotByValue(VectorNew<T> a, double value) {
//        return new VectorNew<T>((T)a.x * value, a.y * value, a.z * value);
//    }
//
//    public double length(VectorNew<T> a) {
//        return Math.sqrt(a.x * a.x + a.y * a.y + a.z * a.z);
//    }
//
//    /**
//     * Returns unit vector of the vector
//     */
//    public VectorNew<T> unitVector(VectorNew<T> a) {
//        double module = length(a);
//        return new VectorNew<T>(a.x / module, a.y / module, a.z / module);
//    }
//
//    public T dotProduct(VectorNew<T> a, VectorNew<T> b) {
//        return a.x * b.x + a.y * b.y + a.z * b.z;
//    }
//
//    public VectorNew<T> crossProduct(VectorNew<T> a, VectorNew<T> b) {
//        T x = a.y * b.z - a.z * b.y;
//        T y = -(a.x * b.z - a.z * b.x);
//        T z = a.x * b.y - a.y * b.x;
//        return new VectorNew<T>(x, y, z);
//    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VectorNew vectorNew = (VectorNew) o;
        return x == vectorNew.x &&
                y == vectorNew.y &&
                z == vectorNew.z;
    }
}
