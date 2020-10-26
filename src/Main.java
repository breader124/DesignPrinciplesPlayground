import java.awt.geom.Point2D;

public class Main {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(
            () -> new Bitmap("Logo.bmp"),
            5
    );

    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D.Double(1, 2));

        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D.Double(2, 3));

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }
}
