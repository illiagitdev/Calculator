package lesson8;

import lesson8.animals.Animal;
import lesson8.inheritence.Cat;
import lesson8.inheritence.Dog;

public class Main {
    public static void main(String[] args) {
        Cat.show();
        Animal animal =new Animal("bobic",3);
        Cat cat=new Cat("Leya",2);

        System.out.println("------------------");

        Animal animal1 =new Cat("qqq",1);
        Cat cat1=new Cat("Llll",2);
        animal1.show();
        cat.show();

        System.out.println("------------------");

        Animal[] animals=new Animal[4];
        animals[0]=new Animal("rrr",1);
        animals[1]=new Cat("cat1",2);
        animals[2]=new Cat("cat2",3);
        animals[3]=new Dog("dog",5);


        for (int i=0;i<animals.length;i++ ) {
            animals[i].show();
            System.out.println(animals[i].getName());
        }
    }
}
