package lesson11_12;

public class Tolik implements ElectricityConsumer {
    @Override
    public void electricityOn() {
        if (Math.random()>0.3){
            System.out.println("Tolik has fainted and baked");
        }
    }

    @Override
    public void electricityOff() {

    }

    @Override
    public String getTitle() {
        return Tolik.class.getSimpleName();
    }
}
