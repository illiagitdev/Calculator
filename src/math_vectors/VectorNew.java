package math_vectors;

import java.util.Objects;

public class VectorNew {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    /**
     * Creates vector with determined values
     *
     * @param x
     * @param y
     * @param z
     */
    public VectorNew(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Creates zero-vector
     */
    public VectorNew() {
        this(0, 0, 0);
    }

    /**
     * Creates vector based on start and end points
     *
     * @param a
     * @param b
     */
    public VectorNew(Point3D a, Point3D b) {
        x = b.getX() - a.getX();
        y = b.getY() - a.getY();
        z = b.getZ() - a.getZ();
    }

    /**
     * Returns vector: sum of two vectors
     * @param a
     * @param b
     * @return
     */
    public VectorNew addVectors(VectorNew a, VectorNew b) {
        return new VectorNew(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    /**
     * Returns dot multiplication on vector
     * @param a
     * @param value
     * @return
     */
    public VectorNew dotByValue(VectorNew a, int value){
        return new VectorNew(a.x*value,a.y*value,a.z*value);
    }

    /**
     * Returns length of the vector
     * @param a
     * @return
     */
    public int length(VectorNew a){

    }


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
