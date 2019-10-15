package lesson8.animals;

public class Animal {
    private int age;
    private String name;

    {
        System.out.println("block Animal");
    }

    static {
        System.out.println("Static initialisation block");
    }

    public Animal(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    static public void show(){
        System.out.println("Static show() parent");
    }
}
