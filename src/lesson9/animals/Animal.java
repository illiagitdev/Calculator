package lesson9.animals;

import lesson9.MakeNoize;

public class Animal implements MakeNoize {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("Name "+name+", age "+age);
    }

    @Override
    public void makeNoize() {
        System.out.println("Voice!!!");
    }
}
