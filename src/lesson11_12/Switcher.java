package lesson11_12;

public class Switcher {
    ElectricityConsumer[] consumers = new ElectricityConsumer[5];
    private int element=0;

    public void addElectricityConsumer(ElectricityConsumer consumer) {
        if (element >=consumers.length)
            return;
        consumers[element++] = consumer;
    }

    public void electricityEnabled() {
        for (int i = 0; i < element; i++) {
            consumers[i].electricityOn();
        }
    }

    public ElectricityConsumer[] getConsumers(){
        ElectricityConsumer[] consumers1=new ElectricityConsumer[element];
        System.arraycopy(consumers, 0,consumers1,0,element-1);
        return consumers1;
    }
}
