package lesson19online;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Book book = new Book(1990, "O`Nell", "novel");

        /*Serializable*/
//        File file = new File("myFile.bin");
//        file.createNewFile();
//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
//
//        outputStream.writeObject(book);
//        outputStream.flush();
//        outputStream.close();
//
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
//        Book newBook = null;
//
//        try {
//            newBook = (Book) in.readObject();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        in.close();

//        Gson

        Gson gson = new Gson();
        String s = gson.toJson(book);
        System.out.println(s);
        Book book1 = gson.fromJson(s, Book.class);
        book.show();
        book1.show();

        Type type=new TypeToken<List<Book>>(){}.getType();
        List<Book> list=new ArrayList<>();
        list.add(book);
        list.add(new Book(1999,"My book","roman"));
        Gson gson1 = new Gson();
        String ss = gson1.toJson(list);


        List<Book> list1=gson1.fromJson(ss,type);
        list1.get(1).show();


        GsonBuilder gsonBuilder=new GsonBuilder();
        gsonBuilder.registerTypeAdapter(type, new CustomDeserializer());
        List<Book> list2=gsonBuilder.create().fromJson(ss,type);
        list2.get(0).show();


        Map<Integer,List<Book>> map=new HashMap<>();
        map.put(1,list);
        Gson gson2 = new Gson();
        String sss = gson1.toJson(map);

    }
}
