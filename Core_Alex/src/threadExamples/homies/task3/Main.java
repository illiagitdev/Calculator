package threadExamples.homies.task3;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
* Задача №3
  Написать программу, которая подсчитает все файлы в папке (с учетом файлов во вложенных папках). Подсчитать потраченное
   время на выполнение, распаралелить данную работу и подсчитать потраченное время на выполнение после использования
   многопоточности.
A/C:
1.  Время должно вывестить в формате : Seconds: 100 s, где 100 s -> дельта времени выполнения программы.
2.  Использовать корневой каталог по этой ссылке (https://drive.google.com/open?id=1OnekofOjxUV-JkcCRPZjW1lYT9IZkTXz)
3.  Желательно не использовать Files.walk().
* */
public class Main {
    public static void main(String[] args) {
        String httpsUrl = "g:/software/";//https://drive.google.com/open?id=1OnekofOjxUV-JkcCRPZjW1lYT9IZkTXz";
        URL url = null;
//        try {
//            url = new URL(httpsUrl);
//            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        long startCount = System.currentTimeMillis();
//        File files=new File(https://drive.google.com/open?id=1OnekofOjxUV-JkcCRPZjW1lYT9IZkTXz)


//        int folderCount=countFiles(httpsUrl);
//        System.out.println();

        long stopCount = System.currentTimeMillis();

        Runnable helloWorld=()-> System.out.println("hello world");
        helloWorld.run();

    }

    private static int countFiles(String path) {
        File file=new File(path);
        int result=0;
        if(!file.isDirectory()){
            List<File> list= Arrays.asList(file.listFiles());
            Stream<File> stream=list.stream();
            stream.forEach(files->{
                System.out.println(files.toString());
            });
            return result+=list.size();
        }

        return 0;
    }
}
