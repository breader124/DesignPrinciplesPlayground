import java.awt.*;

public class Honda extends Car {
    @Override
    public void paint() {
        setColor(Color.WHITE);
    }

    @Override
    public void ride() {
        System.out.println("Wziuuum");
    }
}
