public class Truck extends Vehicle {
    private double loadPercentage = 0.0;

    public void setLoadPercentage(double loadPercentage) {
        if (loadPercentage >= 0 && loadPercentage <= 100) {
            this.loadPercentage = loadPercentage;
        } else {
            throw new IllegalArgumentException("Load percentage out of allowed boundaries");
        }
    }

    @Override
    public void reset() {
        this.loadPercentage = 0.0;
    }

    @Override
    public String toString() {
        return "Km counter = " + kmCounter + "\n" +
                "Load percentage = " + loadPercentage;
    }
}
