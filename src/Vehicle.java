public abstract class Vehicle {
    protected int kmCounter;
    protected int numberOfWheels;

    public Vehicle(int kmCounter, int numberOfWheels) {
        this.kmCounter = kmCounter;
        this.numberOfWheels = numberOfWheels;
    }

    public int getKmCounter() {
        return kmCounter;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public abstract Vehicle clone();

    public abstract void reset();
}
