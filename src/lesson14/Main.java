package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws BluetoothExeption {

        File file=new File("files/myFyle.txt");

        throw new BluetoothExeption("lol");


//        try {
//            file.createNewFile();
////            throw new IndexOutOfBoundsException("my exeption");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            //закрити потоки
//        }

//        FileOutputStream fos=null;
//        try {
//            fos=new FileOutputStream(file,true);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fos.close();
//            } catch (NullPointerException | IOException e) {
//               //
//            }
//        }

//        try(FileOutputStream fos=new FileOutputStream(file,true);) {
//            file.delete();
//            file.delete();
//            fos.write("fhyagkgfkaeruf".getBytes());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("no file");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
