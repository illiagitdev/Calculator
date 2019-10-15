package lesson9.readyBox;

public class Animal {
    private String name;
    private int age;

    {
        System.out.println("blok");
    }

    static {
        System.out.println("static blok");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
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

    public static void show(){
        System.out.println("jjj");
    }
}
