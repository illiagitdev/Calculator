package math_vectors;

public class Vector {
    private Point3D vector = new Point3D();

    public Vector(Point3D a, Point3D b) {
        this.vector.setX(b.getX() - a.getX());
        this.vector.setY(b.getY() - a.getY());
        this.vector.setZ(b.getZ() - a.getZ());
    }

    public Vector() {
        this(new Point3D(), new Point3D(1, 0, 0));
    }

    public Vector(int x, int y, int z) {
        this.vector.setX(x);
        this.vector.setY(y);
        this.vector.setZ(z);
    }

    public Point3D getVector() {
        return vector;
    }

    public Vector vectotMult(Vector a) {
        int x = a.getVector().getY() * vector.getZ() - vector.getY() * a.getVector().getZ();
        int y = -(a.getVector().getX() * vector.getZ() - vector.getX() * a.getVector().getZ());
        int z = a.getVector().getX() * vector.getY() - vector.getX() * a.getVector().getY();
        Vector c = new Vector(x, y, z);
        return c;
    }

    public double scalarMult(Vector a) {
        double result = vector.getX() * a.getVector().getX() + vector.getY() * a.getVector().getY() + vector.getZ() * a.getVector().getZ();
        return result;
    }

    public double modulus() {
        return Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ());
    }

    public Vector multiplyScalar(int a){
        return new Vector(vector.getX()*a,vector.getY()*a,vector.getZ()*a);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "vector=" + vector.toString() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector) {
            return (vector.getX() == ((Vector) obj).getVector().getX()) && (vector.getY() == ((Vector) obj).getVector().getY())
                    && (vector.getZ() == ((Vector) obj).getVector().getZ());
        } else
            return false;
    }
}
