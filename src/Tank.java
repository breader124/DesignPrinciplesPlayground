import java.awt.*;

public class Tank extends Car {
    @Override
    public void paint() {
        setColor(Color.GREEN);
    }

    @Override
    public void ride() {
        System.out.println("WRRR");
    }
}
