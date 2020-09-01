public abstract class CarCreator {
    public Car getPreparedCar() {
        Car c = createCar();
        c.paint();
        c.ride();

        return c;
    }

    protected abstract Car createCar();
}
