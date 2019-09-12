package math_vectors;

public class Main {
    public static void main(String[] args) {
        Point3D a1 = new Point3D(15, 35,0);
        Point3D b1 = new Point3D(345,342,0);
//        Point3D c1 = new Point3D(475,512,0);

//        Point3D a2=new Point3D(345, 342,0);
        Point3D c1=new Point3D(245,302,0);
//        Point3D c2=new Point3D(245,302,0);

        Vector v1 = new Vector(a1,b1);
        Vector v2 = new Vector(b1,c1);

        System.out.println("point a1: "+a1.toString() );
        System.out.println("point b1: "+b1.toString() );
        System.out.println("point c1: "+c1.toString() );

//        System.out.println("point a2: "+a2.toString() );
//        System.out.println("point b2: "+b2.toString() );

        System.out.println("vector v1: "+v1.toString() );
        System.out.println("vector v2: "+v2.toString() );

        System.out.println("vector multiplication "+v1.vectotMult(v2));
    }

}
