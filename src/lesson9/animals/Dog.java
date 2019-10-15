package lesson9.animals;

public class Dog extends Animal {
    private String type;

    public Dog(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return super.getName() +" dog";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void makeNoize() {
        System.out.println("Gav!");
    }

    @Override
    public void show() {
        System.out.println("Type "+type);
    }
}
