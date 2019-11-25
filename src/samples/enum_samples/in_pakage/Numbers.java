package samples.enum_samples.in_pakage;

public abstract class Numbers {
    private int i;

    public Numbers() {
        inililize();
    }

    protected abstract void inililize();

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
