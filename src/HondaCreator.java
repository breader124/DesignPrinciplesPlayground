public class HondaCreator extends CarCreator {
    @Override
    protected Car createCar() {
        return new Honda();
    }
}
