package samples.enum_samples;

public enum SetValuesStraight {
    FIRST {
        @Override
        protected void init() {
            setI(9);
            show();
        }

        private void show() {
            System.out.println(getI());
        }
    }, SECOND {
        @Override
        protected void init() {
            setI(5);
        }
    };

    private int i;

    SetValuesStraight() {
        init();
    }

    protected void init() {
    }

    ;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
