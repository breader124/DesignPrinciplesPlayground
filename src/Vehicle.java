public abstract class Vehicle implements Cloneable {
    protected int kmCounter = 0;

    public void setKmCounter(int kmCounter) {
        this.kmCounter = kmCounter;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Vehicle clone = (Vehicle) super.clone();
        clone.initialize();
        return clone;
    }

    private void initialize() {
        this.kmCounter = 0;
        reset();
    }

    public abstract void reset();
}