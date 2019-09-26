package math_vectors;

public class VectorNew {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    /**
     * Creates vector with determined values
     *
     * @param x
     * @param y
     * @param z
     */
    public VectorNew(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Creates zero-vector
     */
    public VectorNew() {
        this(0.0, 0.0, 0.0);
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
     *
     * @param a
     * @param b
     * @return
     */
    public VectorNew addVectors(VectorNew a, VectorNew b) {
        return new VectorNew(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    /**
     * Returns dot multiplication of scalar on vector
     *
     * @param a
     * @param value
     * @return
     */
    public VectorNew dotByValue(VectorNew a, double value) {
        return new VectorNew(a.x * value, a.y * value, a.z * value);
    }

    /**
     * Returns length of the vector
     *
     * @param a
     * @return
     */
    public double length(VectorNew a) {
        return Math.sqrt(a.x * a.x + a.y * a.y + a.z * a.z);
    }

    /**
     * Returns unit vector of the vector
     *
     * @param a
     * @return
     */
    public VectorNew unitVector(VectorNew a) {
        double module = length(a);
        return new VectorNew(a.x / module, a.y / module, a.z / module);
    }

    /**
     * Returns scalar product
     *
     * @param a
     * @param b
     * @return
     */
    public double dotProduct(VectorNew a, VectorNew b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    /**
     * Returns Vector of vector product
     *
     * @param a
     * @param b
     * @return
     */
    public VectorNew crossProduct(VectorNew a, VectorNew b) {
        double x = a.y * b.z - a.z * b.y;
        double y = -(a.x * b.z - a.z * b.x);
        double z = a.x * b.y - a.y * b.x;
        return new VectorNew(x, y, z);
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
