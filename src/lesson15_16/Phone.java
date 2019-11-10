package lesson15_16;

public class Phone extends Product<Phone> {
    String model;

    @Override
    int subCompare(Phone o) {
        return 0;
    }
}
