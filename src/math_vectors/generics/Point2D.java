package math_vectors.generics;

public class Point2D<T> {
    T x;
    T y;

    public Point2D(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
}
