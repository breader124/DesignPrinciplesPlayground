package tester;

public class TestEngineer implements Tester {
    @Override
    public void testStuff() {
        System.out.println("Working on tests plan");
    }

    @Override
    public void proveValidity() {
        System.out.println("Checking results from testers");
    }
}
