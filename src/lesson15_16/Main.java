package lesson15_16;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Container <Product<Camera>> container = new Container<>();

        container.setItem(new Camera());
        Product product = container.getItem();

//        isExist(new ArrayList<Phone>(), new Camera());
        listCopy(new ArrayList<Phone>(), new ArrayList<Object>());
//        new Camera().compareTo()



    }

    static <T extends Product>boolean isExist(List<T> products,
                                              T product){
        for(T pr : products){
            if(product.equals(pr)){
                return true;
            }
        }
        return false;
    }

    static void listCopy(List<?extends Product> src,
                         List<?super Product> destination){
        for(Product product : src){
            destination.add(product);
        }
    }
}
