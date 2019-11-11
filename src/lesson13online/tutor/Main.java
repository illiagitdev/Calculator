package lesson13online.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Main {
    enum NMEATypes {GPGGA, GPZDA, GPPPA};

    interface NMEA{
        NMEATypes getType();
    }

    interface MyInterface{}



    static class GPGGA implements NMEA{

        @Override
        public NMEATypes getType() {
            return NMEATypes.GPGGA;
        }
    }


    static class GPZDA implements NMEA{

        @Override
        public NMEATypes getType() {
            return NMEATypes.GPZDA;
        }
    }

    static class GPPPA implements NMEA{

        @Override
        public NMEATypes getType() {
            return NMEATypes.GPPPA;
        }
    }





    public static void main(String[] strings) throws IOException {

       /* //Singleton.getInstance("s1").show();
        String s= Singleton2.INSTANCE.data;
       // String s2=Singleton2.ROOT_INSTANCE.data;*/


        File file = new File("files.data.points\\files\\myFile.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        if(!file.exists()){
            file.createNewFile();
//            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file,true);
        fos.write("this is my file\n".getBytes());
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        System.out.println(new String(arr));
        fis.close();



    }

    public static String doSomething (NMEA nmea){
        switch (nmea.getType()){
            case GPGGA:
                return "GPGGA";
            case GPZDA:
                return "GPZDA";
            case GPPPA:
                return "GPPPA";
                default: return "";
        }
    }
}
