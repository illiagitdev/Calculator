package lesson9.animals;

import lesson9.MakeNoize;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName()+" cat";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void show() {
        System.out.println("This is a cat");
    }
}
