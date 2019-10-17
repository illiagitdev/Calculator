package lesson10.categories;

public class DrinkWater extends Goods {
    public DrinkWater() {
    }

    public DrinkWater(int id, String name, int amount, String description, double price) {
        super(id, name, amount, description, price);
    }

    @Override
    public String show() {
        return "питьевая вода:{\n" + super.show() + "\n"+
                '}';
    }
}
