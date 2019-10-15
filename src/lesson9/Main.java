package lesson9;

import lesson9.animals.Animal;
import lesson9.animals.Cat;
import lesson9.animals.Dog;
import lesson9.vehicle.Car;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Dog dog1 = new Dog();
//        Animal animal = new Cat();

        MakeNoize[] noizy = new MakeNoize[5];
        noizy[0] = new Cat("Meow", 2);
        noizy[1] = new Dog("Moo", 1, "gr");
        noizy[2] = new Car();
        noizy[3] = new Dog("DodA", 4, "bobic");
        noizy[4] = new Cat("Gfd", 5);

        for (int i = 0; i < noizy.length; i++) {
            noizy[i].makeNoize();
        }
    }
}
