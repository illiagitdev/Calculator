package lesson7;

public class Animal {
    private String name;
    private int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Animal(){
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
        if (age>=0) {
            this.age = age;
        }
    }
}
