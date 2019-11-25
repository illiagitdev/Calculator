package samples.enum_samples.in_pakage;

public enum Type {
    FIRST(new First()), SECOND(new Second());

    private Numbers numbers;

    Type(Numbers numbers) {
        this.numbers = numbers;
    }

    public Numbers getInstance() {
        return numbers;
    }
}
