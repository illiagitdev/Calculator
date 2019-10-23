package lesson11_12;

public class Main {
    public static void main(String[] args) {
        electricityEnabled(new Lamp());

        /*
        * анонимний клас
        * */
        electricityDisabled(new ElectricityConsumer() {
            int a;
            @Override
            public void electricityOn() {
                System.out.println();
            }

            @Override
            public void electricityOff() {
                System.out.println("short Circuit");
            }

            @Override
            public String getTitle() {
                return null;
            }

            public void doIt(int a){
                electricityEnabled(new Lamp());
            }
        });
    }

    static void electricityEnabled(ElectricityConsumer consumer){
        consumer.electricityOn();
    }

    static void electricityDisabled(ElectricityConsumer consumer){
        consumer.electricityOff();
    }

}
