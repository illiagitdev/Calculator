package lesson8.inheritence;

import lesson8.animals.Animal;

public class Cat extends Animal {

    static {
        System.out.println("Static cat)))");
    }
    public Cat(String leya, int i) {
        super(leya,i);
//        super.setName(leya);
//        super.setAge(i);
    }

    static public void show2(){
        System.out.println("Static show() Cat");
    }

    @Override
    public String getName() {
        return "cat";
    }

    static public void show(){
        System.out.println("Static show() cat");
    }
}
