package lesson17_18;

public enum Type {
    FIRST, SECOND;

    int i;

    Type() {
        initialize();
    }

    private void initialize() {
        if (this == Type.FIRST) {
            i = 5;
            System.out.println(i);
        } else if (this == Type.SECOND) {
            i = 7;
            System.out.println(i);
        }
    }


}
