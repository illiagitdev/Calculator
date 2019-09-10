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

    public Vector(int x,int y,int z) {
        this.vector.setX(x);
        this.vector.setY(y);
        this.vector.setZ(z);
    }

    public Point3D getVector() {
        return vector;
    }



    @Override
    public String toString() {
        return "Vector{" +
                "vector=" + vector.toString() +
                '}';
    }
}
