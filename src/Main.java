public class Main {
    public static void main(String[] args) {
        assembleCar(new TankCreator());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        assembleCar(new HondaCreator());
    }

    private static void assembleCar(CarCreator carCreator) {
        Car assembledCar = carCreator.getPreparedCar();
        System.out.println(assembledCar.toString());
    }
}
