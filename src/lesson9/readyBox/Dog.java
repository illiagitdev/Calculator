package lesson9.readyBox;

public class Dog extends Animal {
    private String type;

    public Dog(String dog, int i) {
        super(dog,i);
    }

    public Dog(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
