package math_vectors;

public class Point3D {
    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y) {
        this.x = x;
        this.y = y;
        z=0;
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        this(0,0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point3D){
            return (x==((Point3D) obj).getX())&&(y==((Point3D) obj).getY())&&(z==((Point3D) obj).getZ());
        }
        else
        return false;
    }
}
