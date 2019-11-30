package lesson21online;

public class Persom {
    String name;
    byte age;

    public Persom(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persom{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
