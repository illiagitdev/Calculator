package lesson7;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Sem",7);
        animal.setAge(3);
        animal.setName("Guffy");

        Animal[] mas=new Animal[5];
        mas[0]=animal;
        mas[1]=new Animal();

        System.out.println(mas[0].getName()+" mas[0].name "+animal.getName()+" animal.name");

        animal.setName("Jessy");
        System.out.println(mas[0].getName()+" mas[0].name "+animal.getName()+" animal.name");

    }
}
