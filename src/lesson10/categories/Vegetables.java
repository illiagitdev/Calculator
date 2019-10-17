package lesson10.categories;

import lesson10.properties.WarrantyTerms;


public class Vegetables extends Goods {
    private String kind;
    public WarrantyTerms expirationTime;

    public Vegetables() {
    }

    public Vegetables(int id, String name, int amount, String description, double price) {
        super(id, name, amount, description, price);
    }

    public Vegetables(int id, String name, int amount, String description, double price, String kind, String productionDate, int saveTemperature, String expirationTime) {
        super(id, name, amount, description, price);
        this.kind = kind;
    }

    @Override
    public String show() {
        return "овощи:{\n" + super.show() + toString();
    }

}
