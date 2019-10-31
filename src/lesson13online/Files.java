package lesson13online;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        File file=new File("files/myFile");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        if(!file.exists()){
            file.createNewFile();
            file.mkdir();
        }

        FileOutputStream fos =new FileOutputStream(file);
        fos.write("my text for file".getBytes());
        fos.flush();
        fos.close();

        FileInputStream fis;

    }
}
