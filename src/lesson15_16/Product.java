package lesson15_16;

public abstract class Product<T extends Product<T>> implements Comparable<Product<T>> {

    String name;
    double price;

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    abstract int subCompare(T o);
    /*{
        if (name.equals(o.name) && price-o.price <= 0.0001) {
            return 0;
        }
        return -1;
    }*/
}
