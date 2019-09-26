package math_vectors;

import java.io.*;
import java.util.Scanner;

public class ReadPointsTxt {
    public static void main(String[] args) throws IOException {
        Point3D[] shape = readPoints3D("files.data.points\\points.txt");

        for (Point3D x:shape             ) {
            System.out.println(x.toString());
        }

    }

    private static Point3D[] readPoints3D(String path) throws FileNotFoundException {
        Scanner file = new Scanner(new File(path));
        String[] lines;
        int counter = 0;

        while (file.hasNext()) {
            file.next();
            counter++;
        }
        file.close();

        file = new Scanner(new File(path));
        System.out.println(counter);
        Point3D[] list = new Point3D[counter];
        counter=0;
        while (file.hasNext()) {
            lines = file.next().split(",");
            list[counter]=new Point3D(Integer.valueOf(lines[0]), Integer.valueOf(lines[1]), Integer.valueOf(lines[2]));
            counter++;
        }
        return list;
    }
}
