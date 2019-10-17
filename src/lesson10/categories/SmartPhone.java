package lesson10.categories;

import lesson10.properties.techspecification.Processor;
import lesson10.properties.techspecification.OperationalSystem;
import lesson10.properties.techspecification.Ram;
import lesson10.properties.techspecification.TechSpesification;

public class SmartPhone extends Goods {
    public TechSpesification[] smartphoneTechnical={new OperationalSystem(),new Ram(),new Processor()};
    public int warrantyPeriod;//days

    public SmartPhone(int id, String name, int amount, String description, double price) {
        super(id, name, amount, description, price);
    }

    public SmartPhone(int id, String name, int amount, String description, double price, String operational,
                      double ramAmount, String ramType, int coreNumber, double coreFrequency, double diagonal, int batteryLifeTime, int varrantyPeriod) {
        super(id, name, amount, description, price);
        this.warrantyPeriod = varrantyPeriod;
    }

    public SmartPhone() {
    }

    @Override
    public String show() {
        return "смартфон:{\n" + super.show() + toString();
    }

//    @Override
//    public String toString() {
//        return "\n\tтех. спецификация:" +
//                "\n\t\tоперационная система\t\t" + operational + "\n" +
//                "\t\tоперативная память\n" +
//                "\t\t\tобъем\t\t\t\t\t" + ramAmount + "\n" +
//                "\t\t\tтип памяти\t\t\t\t" + ramType + "\n" +
//                "\t\tпроцессор\n" +
//                "\t\t\tкол-во ядер\t\t\t\t" + coreNumber + "\n" +
//                "\t\t\tтактовая частота ядра\t" + coreFrequency + "\n" +
//                "\t\tдиагональ экрана\t\t\t" + diagonal + "\n" +
//                "\t\tвремя работы от батареи\t\t" + batteryLifeTime + "\n" +
//                "\tгарантийный срок\t\t\t\t" + warrantyPeriod + "\n" +
//                '}';
//    }
}
