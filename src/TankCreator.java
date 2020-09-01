public class TankCreator extends CarCreator {
    @Override
    protected Tank createCar() {
        return new Tank();
    }
}
