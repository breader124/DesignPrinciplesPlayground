import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private final List<String> passengerList = new ArrayList<>();

    public List<String> getPassengerList() {
        return passengerList;
    }

    public void addPassenger(String passenger) {
        passengerList.add(passenger);
    }

    @Override
    public void reset() {
        passengerList.clear();
    }

    @Override
    public String toString() {
        return "Km counter = " + kmCounter + "\n" +
                "Passengers: " + passengerList;
    }
}