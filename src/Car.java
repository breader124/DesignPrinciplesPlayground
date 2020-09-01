import java.awt.*;

public class Car {
    private int numberOfSeats;
    private int numberOfWheels;
    private int trunkCapacityInLiters;
    private Color color;
    private String engineType;

    private Car() { }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setTrunkCapacityInLiters(int trunkCapacityInLiters) {
        this.trunkCapacityInLiters = trunkCapacityInLiters;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("numberOfSeats: ").append(numberOfSeats).append("\n");
        builder.append("numberOfWheels: ").append(numberOfWheels).append("\n");
        builder.append("trunkCapacityInLiters: ").append(trunkCapacityInLiters).append("\n");
        builder.append("color: ").append(color).append("\n");
        builder.append("engineType: ").append(engineType).append("\n");

        return builder.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int numberOfSeats = 5;
        private int numberOfWheels = 4;
        private int trunkCapacityInLiters = 50;
        private Color color = Color.MAGENTA;
        private String engineType = "5.8 V8 330 KM";

        public Builder withNumberOfSeats(int num) {
            numberOfSeats = num;
            return this;
        }

        public Builder withTrunkCapacityInLiters(int capacity) {
            trunkCapacityInLiters = capacity;
            return this;
        }

        public Builder withColor(Color col) {
            color = col;
            return this;
        }

        public Builder withNumberOfWheels(int num) {
            numberOfWheels = num;
            return this;
        }

        public Builder withEngineType(String type) {
            engineType = type;
            return this;
        }

        public Car build() {
            Car c = new Car();
            c.setNumberOfSeats(numberOfSeats);
            c.setNumberOfWheels(numberOfWheels);
            c.setTrunkCapacityInLiters(trunkCapacityInLiters);
            c.setColor(color);
            c.setEngineType(engineType);

            return c;
        }
    }
}
