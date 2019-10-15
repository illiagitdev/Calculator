package lesson9.readyBox;

public class Cat extends Animal{
    static {
        System.out.println("static kot");
    }

    public Cat(String lol, int i) {
        super(lol,i);
    }

    public static void show(){
        System.out.println("show 2");
    }

    @Override
    public String getName() {
        return "cat";
    }
}
