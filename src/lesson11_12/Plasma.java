package lesson11_12;

public class Plasma implements ElectricityConsumer {
    @Override
    public void electricityOn() {
        System.out.println("Plasma is on");
    }

    @Override
    public void electricityOff() {

    }

    @Override
    public String getTitle() {
        return Plasma.class.getSimpleName();
    }
}
