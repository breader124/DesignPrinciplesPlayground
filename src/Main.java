public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car(500, 4);
        Vehicle t = new Truck(500000, 6);

        Vehicle cClone = c.clone();
        Vehicle tClone = t.clone();

        System.out.println("Original");
        System.out.println(c.getKmCounter());
        System.out.println(c.getNumberOfWheels());
        System.out.println(t.getKmCounter());
        System.out.println(t.getNumberOfWheels());
        
        System.out.println("Clones");
        System.out.println(cClone.getKmCounter());
        System.out.println(cClone.getNumberOfWheels());
        System.out.println(tClone.getKmCounter());
        System.out.println(tClone.getNumberOfWheels());
    }
}