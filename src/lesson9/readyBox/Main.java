package lesson9.readyBox;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("kot1",1);
        animals[1] = new Cat("kot2",5);
        animals[2] = new Animal("animal",5);
        animals[3] = new Dog("dog",5);

        for (int i = 0; i < animals.length; i++) {
            animals[i].show();
            //System.out.println(animals[i].getName());
        }
    }
}
