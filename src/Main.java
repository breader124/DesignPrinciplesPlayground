import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car withAllArguments = Car.builder()
                .withNumberOfSeats(6)
                .withNumberOfWheels(8)
                .withTrunkCapacityInLiters(150)
                .withColor(Color.BLACK)
                .withEngineType("500 KM")
                .build();
        System.out.println(withAllArguments.toString());

        Car withSomeDefaults = Car.builder()
                .withNumberOfSeats(5)
                .build();
        System.out.println(withSomeDefaults.toString());
    }
}
