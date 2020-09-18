public class Car extends Vehicle {
    public Car(int kmCounter, int numberOfWheels) {
        super(kmCounter, numberOfWheels);
    }

    @Override
    public Vehicle clone() {
        Car clone = new Car(this.getKmCounter(), this.getNumberOfWheels());
        clone.reset();
        return clone;
    }

    @Override
    public void reset() {
        this.kmCounter = 0;
    }
}