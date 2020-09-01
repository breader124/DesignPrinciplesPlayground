import java.awt.*;

public class Car {
    private int numberOfSeats = 4;
    private Color color = Color.BLUE;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint() {
        color = Color.BLACK;
    }

    public void ride() {
        System.out.println("Brrrum");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("numberOfSeats: ").append(numberOfSeats).append("\n");
        builder.append("color: ").append(color).append("\n");

        return builder.toString();
    }
}
