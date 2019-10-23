package lesson11_12;

public class Lamp implements ElectricityConsumer{
    protected int power;
    Filamen filamen;

    @Override
    public void electricityOn() {
        System.out.println("lamp switch ON!");
    }

    @Override
    public void electricityOff() {
        System.out.println("lamp switch OFF!");
    }

    @Override
    public String getTitle() {
        return this.getClass().getSimpleName();//Lamp.class.getSimpleName();
    }

    //нитка розжарення внутрішній клас
    class Filamen{
        int length;
        String deskr;
    }

    public void doSomething(String str){
        System.out.println("through reflection: " +str);
    }
}
