package math_vectors.generics;

public class Main {
    public static void main(String[] args) {
        Point2D<Float> fPoint=new Point2D<>(2.0f,5.f);
        Point2D<Float> fPoint1=new Point2D<>(2.0f,5.f);
        Point3D<Double> dPoint=new Point3D<>(2.3,5.53,1.5);
        Point3D<Double> dPoint1=new Point3D<>(2.7,5.31,8.11);
        Point4D<Integer> iPoint=new Point4D<>(2,5,43,11);
        Point4D<Integer> iPoint1=new Point4D<>(7,7,32,1);

//        show(fPoint);
//        show(fPoint1);
//        show(dPoint);
//        show(dPoint1);
//        show(iPoint);
//        show(iPoint1);

        Coords<Point2D> arr=new Coords<>();

    }

    static <T extends Point2D> void show(T o){
        System.out.println("point: x = "+o.getX()+", y = "+o.getY());
    }

    static <T extends Point3D> void show(T o){
        System.out.println("point: x = "+o.getX()+", y = "+o.getY()+", z = "+o.getZ());
    }

    static <T extends Point4D> void show(T o){
        System.out.println("point: x = "+o.getX()+", y = "+o.getY()+", z = "+o.getZ()+", t = "+o.getT());
    }

//    static  void showAll(T o){
//        System.out.println("point: x = "+o.getX()+", y = "+o.getY()+", z = "+o.getZ());
//    }
}
