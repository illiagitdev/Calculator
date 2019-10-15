package lesson9.vehicle;

import lesson9.MakeNoize;

public class Car implements MakeNoize {

    @Override
    public void makeNoize() {
        System.out.println("GRRRRRR!!!!");
    }
}
