package lesson10.categories;

import lesson10.properties.WarrantyTerms;

public class Sweets extends Goods {
    public WarrantyTerms expirationTime;

    public Sweets() {
    }

    public Sweets(int id, String name, int amount, String description, double price) {
        super(id, name, amount, description, price);
    }

    public Sweets(int id, String name, int amount, String description, double price, String productionDate, int saveTemperature, String expirationTime) {
        super(id, name, amount, description, price);
    }

    @Override
    public String show() {
        return "сладости:{\n" + super.show() + toString();
    }

//    @Override
//    public String toString() {
//        return "\n\tсрок годности\n" +
//                "\t\tдата производства\t\t\t\t\t" + productionDate + "\n" +
//                "\t\tтемпература хранения\t\t\t\t" + saveTemperature + "\n" +
//                "\t\tпродолжительность срока годности\t" + expirationTime + "\n" +
//                '}';
//    }
}
