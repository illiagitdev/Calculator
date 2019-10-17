package lesson10.categories;

import lesson10.properties.WearBrand;

import java.time.LocalDate;

public class Wear extends Goods {
    public WearBrand brand;

    public Wear() {
    }

    public Wear(int id, String name, int amount, String description, double price) {
        super(id, name, amount, description, price);
    }

    public Wear(int id, String name, int amount, String description, double price, int brandFoundationYeat, String brandName, int brandEmploeesNumber, int brandSellCountiesNumber) {
        super(id, name, amount, description, price);
    }

    @Override
    public String show() {
        return "сладкие напитки:{\n" + super.show() + toString();
    }

//    @Override
//    public String toString() {
//        return "\n\tбренд" +
//                "\n\t\tгод основания\t\t\t\t\t\t\t" + brandFoundationYeat + "\n" +
//                "\t\tназвание\t\t\t\t\t\t\t\t" + brandName + "\n" +
//                "\t\tкол-во работников\t\t\t\t\t\t" + brandEmploeesNumber + "\n" +
//                "\t\tкол-во стран в котором продаются товары\t" + brandSellCountiesNumber + "\n" +
//                '}';
//    }
}
