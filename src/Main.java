import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) throws CloneNotSupportedException {
        testCarCloning();
        testTruckCloning();
    }

    private static void testCarCloning() throws CloneNotSupportedException {
        Car c = new Car();
        c.setKmCounter(50000);
        c.addPassenger("Robert De Niro");
        c.addPassenger("Emma Watson");
        logger.log(Level.INFO, c.toString());

        Car clonedCar = (Car) c.clone();
        logger.log(Level.INFO, clonedCar.toString());
    }

    private static void testTruckCloning() throws CloneNotSupportedException {
        Truck t = new Truck();
        t.setKmCounter(500000);
        t.setLoadPercentage(89.0);

        logger.log(Level.INFO, t.toString());

        Truck clonedTruck = (Truck) t.clone();
        logger.log(Level.INFO, clonedTruck.toString());
    }
}