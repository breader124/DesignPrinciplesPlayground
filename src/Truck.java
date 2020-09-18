public class Truck extends Vehicle {
    public Truck(int kmCounter, int numberOfWheels) {
        super(kmCounter, numberOfWheels);
    }

    @Override
    public Vehicle clone() {
        Truck clone = new Truck(this.getKmCounter(), this.getNumberOfWheels());
        clone.reset();
        return clone;
    }

    @Override
    public void reset() {
        System.out.println("Truck test drive");
        this.kmCounter = 10; // because test drive 🤷
    }
}
